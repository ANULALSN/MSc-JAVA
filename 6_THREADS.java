package add;


class oddThreads extends Thread{
	public void run() {
		for(int i=1;i<=10;i+=2) {
			System.out.println("Odd:"+i);
		}
		try {
			
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

class evenThreads extends Thread{
	public void run() {
		for(int i=2;i<=10;i+=2) {
			System.out.println("Even"+i);
		}
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
public class Threadsamp {
  public static void main(String args[]) {
	  oddThreads odd=new oddThreads();
	  evenThreads even=new evenThreads();
	  odd.start();
	  even.start();
	
}
}


//OUTPUT
/* Odd:1
Even2
Even4
Even6
Even8
Even10
Odd:3
Odd:5
Odd:7
Odd:9
*/
