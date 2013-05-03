/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw;

import org.lwjgl.LWJGLUtil;

import java.util.concurrent.TimeUnit;

import com.lmax.disruptor.*;

/**
 * Wraps a WindowCallback to allow for asynchronous event notification. Events are queued from the NSApplication main thread and fired in the client thread that
 * calls {@link GLFW#glfwPollEvents} or {@link GLFW#glfwWaitEvents}.
 * <p/>
 * This implementantion uses an single-producer/single-consumer LMAX {@link RingBuffer} for passing events from the main thread to the client thread. It enables
 * lock-free synchronization, bounded batching and no runtime allocations. It also allows for customizable waiting strategies on {@link
 * GLFW#glfwWaitEvents}. Currently a phased-backoff strategy is used (spin, then yield, then sleep).
 *
 * @see <a href="http://github.com/LMAX-Exchange/disruptor">LMAX Exchange - Disruptor</a>
 */
final class WindowCallbackMacOSX extends WindowCallback {

	/** The ring-buffer size. */
	private static final int BUFFER_SIZE = 32;

	/** The event ring-buffer. */
	private static final RingBuffer<Event> ringBuffer = RingBuffer.createSingleProducer(
		// Used to fill the ring-buffer with pre-allocated events.
		new EventFactory<Event>() {
			@Override
			public Event newInstance() {
				return new Event();
			}
		},
		BUFFER_SIZE,
		// TODO: tune
		PhasedBackoffWaitStrategy.withSleep(1L, 1L, TimeUnit.MILLISECONDS)
		//new BlockingWaitStrategy()
	);

	/** Tracks the last published event. */
	private static final SequenceBarrier publishBarrier = ringBuffer.newBarrier();

	/** Tracks the last consumed event. */
	private static final Sequence consumeSequence = new Sequence(Sequencer.INITIAL_CURSOR_VALUE);

	static {
		ringBuffer.addGatingSequences(consumeSequence);
	}

	private final WindowCallback target;

	WindowCallbackMacOSX(WindowCallback target) {
		this.target = target;
	}

	/**
	 * Publishes an event to the ring-buffer. This method is called from the main thread.
	 *
	 * @param target the target WindowCallback
	 * @param type   the event type
	 * @param window the window handle
	 * @param x      the first parameter
	 * @param y      the second parameter
	 */
	private static void offer(WindowCallback target, int type, long window, double x, double y) {
		long next = ringBuffer.next();

		try {
			Event event = ringBuffer.get(next);

			event.target = target;
			event.type = type;
			event.window = window;
			event.x = x;
			event.y = y;
		} finally {
			ringBuffer.publish(next);
		}
	}

	private static final double NULL = 0.0;

	@Override
	public void windowPos(long window, int xpos, int ypos) {
		offer(target, WINDOW_POS, window, xpos, ypos);
	}

	@Override
	public void windowSize(long window, int width, int height) {
		offer(target, WINDOW_SIZE, window, width, height);
	}

	@Override
	public void windowClose(long window) {
		offer(target, WINDOW_CLOSE, window, NULL, NULL);
	}

	@Override
	public void windowRefresh(long window) {
		offer(target, WINDOW_REFRESH, window, NULL, NULL);
	}

	@Override
	public void windowFocus(long window, int focused) {
		offer(target, WINDOW_FOCUS, window, focused, NULL);
	}

	@Override
	public void windowIconify(long window, int iconified) {
		offer(target, WINDOW_ICONIFY, window, iconified, NULL);
	}

	@Override
	public void key(long window, int key, int action) {
		offer(target, KEY, window, key, action);
	}

	@Override
	public void character(long window, int character) {
		offer(target, CHARACTER, window, character, NULL);
	}

	@Override
	public void mouseButton(long window, int button, int action) {
		offer(target, MOUSE_BUTTON, window, button, action);
	}

	@Override
	public void cursorPos(long window, double xpos, double ypos) {
		offer(target, CURSOR_POS, window, xpos, ypos);
	}

	@Override
	public void cursorEnter(long window, int entered) {
		offer(target, CURSOR_ENTER, window, entered, NULL);
	}

	@Override
	public void scroll(long window, double xpos, double ypos) {
		offer(target, SCROLL, window, xpos, ypos);
	}

	static void pollEvents() {
		long consumeNext = consumeSequence.get() + 1L;
		long consumeMax = publishBarrier.getCursor();

		// See if there's an event available
		if ( consumeNext <= consumeMax ) {
			do {
				// Fire in the current thread
				ringBuffer
					.get(consumeNext)
					.fire();

				// Keep firing until we reach consumeMax (batch-processing).
				consumeNext++;
			} while ( consumeNext <= consumeMax );

			// Let the ring-buffer know we're done processing this batch.
			consumeSequence.set(consumeMax);
		}
	}

	static void waitEvents() {
		try {
			// Block using the ring-buffer's wait strategy until at least one event is available.
			publishBarrier.waitFor(consumeSequence.get() + 1L);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		pollEvents();
	}

	/** Mutable event for use in the ring-buffer. Integer parameters are encoded as doubles. */
	private static class Event {

		WindowCallback target;

		int type;

		long window;

		double x;
		double y;

		void fire() {
			switch ( type ) {
				case WINDOW_POS:
					target.windowPos(window, (int)x, (int)y);
					break;
				case WINDOW_SIZE:
					target.windowSize(window, (int)x, (int)y);
					break;
				case WINDOW_CLOSE:
					target.windowClose(window);
					break;
				case WINDOW_REFRESH:
					target.windowRefresh(window);
					break;
				case WINDOW_FOCUS:
					target.windowFocus(window, (int)x);
					break;
				case WINDOW_ICONIFY:
					target.windowIconify(window, (int)x);
					break;
				case KEY:
					target.key(window, (int)x, (int)y);
					break;
				case CHARACTER:
					target.character(window, (int)x);
					break;
				case MOUSE_BUTTON:
					target.mouseButton(window, (int)x, (int)y);
					break;
				case CURSOR_POS:
					target.cursorPos(window, (int)x, (int)y);
					break;
				case CURSOR_ENTER:
					target.cursorEnter(window, (int)x);
					break;
				case SCROLL:
					target.scroll(window, (int)x, (int)y);
					break;
				default:
					throw new IllegalStateException("Invalid event type: " + LWJGLUtil.toHexString(type));
			}

		}
	}

}