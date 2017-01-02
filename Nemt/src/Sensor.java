import jssc.*;

public class Sensor{
		
		//private double value = 0.0;
		private Double resultat = new Double(0);
		private SerialPort serialPort;
		private String måling = "";
		
		// Test-sensor attributter
		private final int START = 168;
		private final double DELTAMAX = 0.25;
		private double value = START;
		
		/** Standard-konstruktør*/
		public Sensor(){
			setup();
		}
		
		public double getValue(){
			try {
				if (serialPort.getInputBufferBytesCount() > 0)
				{
					Thread.sleep(1000);
					måling = "";
					måling = serialPort.readString();
					måling = måling.substring(2, 6);
					resultat = Double.parseDouble(måling);
					return resultat;
				}
				else return 0;
			//serialPort.setDTR(false);
			//serialPort.closePort(); //Close serial port
			}
			catch (SerialPortException e1) {
				e1.printStackTrace();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		public void setup(){
			try{
				String[] portNames = SerialPortList.getPortNames();
				String port = portNames[0];
				this.serialPort = new SerialPort(port);
				serialPort.openPort();//Open serial port
				serialPort.setParams(9600, 8, 1, 0);//Set params.
				serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
				serialPort.setDTR(true);
				
			}
			catch(ArrayIndexOutOfBoundsException b){
				System.out.println("Der var ikke tilsluttet nogen enheder");
			}
		    catch (SerialPortException ex) {
		        System.out.println("Serial Port Exception: " + ex);
			} 
		}
		/*	Til test
		public int getValue()
		{
			value += (2*Math.random()-1.0) * DELTAMAX;
			if ( value < 0.0 ) value = 0.0;
			if ( value > 255.0 ) value = 255.0;
		return (int) value;
		}
		*/ 
}