package org.eclipse.fx.drift.internal;

import java.time.Duration;
import java.util.LinkedList;
import java.util.Queue;

public class FPSCounter {
	long lastFrame;
	Queue<Long> framesTimes = new LinkedList<>();
	
	double avgFps;
	
	public void frame() {
		long lastFrameDur = System.nanoTime() - lastFrame;
		if (framesTimes.size() > 10) framesTimes.poll();
		framesTimes.offer(lastFrameDur);
		
		lastFrame = System.nanoTime();
		
		//double avgTime = framesTimes.stream().mapToLong(l -> l).average().orElse(0);
		//System.err.println(String.format("%5.3ffps", Duration.ofSeconds(1).toNanos() / avgTime));
	}
	
	public double avgTime() {
		return framesTimes.stream().mapToLong(l -> l).average().orElse(0);
		
	}
	
	public double avgFps() {
		return Duration.ofSeconds(1).toNanos() / avgTime();
	}
}
