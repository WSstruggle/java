package api;

import java.io.IOException;

public class Runtime_test {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt=Runtime.getRuntime();
		System.out.println("�������ĸ�����:"+rt.availableProcessors()+"��");
		System.out.println("�����ڴ��С��:"+rt.freeMemory()/1024/1024+"MB");
		System.out.println("�������ڴ���:"+rt.maxMemory()/1024/1024+"MB");
		
		Process process=rt.exec("SoundRecorder");
		Thread.sleep(1000);
		process.destroy();
	}

}
