package api;

import java.io.IOException;

public class Runtime_test {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器的个数是:"+rt.availableProcessors()+"个");
		System.out.println("空闲内存大小是:"+rt.freeMemory()/1024/1024+"MB");
		System.out.println("最大可用内存是:"+rt.maxMemory()/1024/1024+"MB");
		
		Process process=rt.exec("SoundRecorder");
		Thread.sleep(1000);
		process.destroy();
	}

}
