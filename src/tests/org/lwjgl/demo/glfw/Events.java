package org.lwjgl.demo.glfw;

import org.lwjgl.Sys;
import org.lwjgl.system.glfw.ErrorCallback;
import org.lwjgl.system.glfw.MonitorCallback;
import org.lwjgl.system.glfw.WindowCallback;

import static org.lwjgl.system.glfw.GLFW.*;

public class Events {

	private Events() {
	}

	public static void main(String[] args) {
		Sys.touch();

		glfwSetErrorCallback(new ErrorCallback());
		if ( glfwInit() == 0 )
			throw new IllegalStateException("Failed to initialize GLFW.");

		System.out.println("GLFW initialized");

		try {
			demo();
		} finally {
			glfwTerminate();
		}
	}

	private static void demo() {
		System.out.println("GLFW initialized");

		glfwDefaultWindowHints();
		final long window = glfwCreateWindow(640, 480, "GLFW Event Demo", 0L, 0L);
		if ( window == 0L )
			throw new IllegalStateException("Failed to create GLFW window.");

		System.out.println("Window opened.");

		glfwSetMonitorCallback(new MonitorCallback() {
			@Override
			public void invoke(final long monitor, final int event) {
				System.out.println("Monitor " + monitor + " was " + (event == 0x00061000 ? "connected" : "disconnected"));
			}
		});

		WindowCallback.set(window, new WindowCallback() {
			@Override
			public void windowPos(final long window, final int xpos, final int ypos) {
				printEvent(window, "moved to %d, %d", xpos, ypos);
			}

			@Override
			public void windowSize(final long window, final int width, final int height) {
				printEvent(window, "resized to %d x %d", width, height);
			}

			@Override
			public void windowClose(final long window) {
				printEvent(window, "closed");
			}

			@Override
			public void windowRefresh(final long window) {
				printEvent(window, "refreshed");
			}

			@Override
			public void windowFocus(final long window, final int focused) {
				printEvent(window, focused == 0 ? "lost focus" : "gained focus");
			}

			@Override
			public void windowIconify(final long window, final int iconified) {
				printEvent(window, iconified == 0 ? "restored" : "iconified");
			}

			@Override
			public void key(final long window, final int key, final int action) {
				final String state;
				switch ( action ) {
					case GLFW_PRESS:
						state = "pressed";
						break;
					case GLFW_RELEASE:
						state = "released";
						break;
					case GLFW_REPEAT:
						state = "repeated";
						break;
					default:
						throw new IllegalArgumentException();
				}

				printEvent(window, "key [%d] was %s", key, state);

				if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
					nglfwSetWindowShouldClose(window, 1);
			}

			@Override
			public void character(final long window, final int character) {
				printEvent(window, "character %s", Character.toString((char)character));
			}

			@Override
			public void mouseButton(final long window, final int button, final int action) {
				final String state;
				switch ( action ) {
					case GLFW_PRESS:
						state = "pressed";
						break;
					case GLFW_RELEASE:
						state = "released";
						break;
					default:
						throw new IllegalArgumentException();
				}
				printEvent(window, "mouse button [%d] was %s", button, state);
			}

			@Override
			public void cursorPos(final long window, final int xpos, final int ypos) {
				printEvent(window, "cursor moved to %d, %d", xpos, ypos);
			}

			@Override
			public void cursorEnter(final long window, final int entered) {
				printEvent(window, "cursor %s", entered == 0 ? "left" : "entered");
			}

			@Override
			public void scroll(final long window, final double xpos, final double ypos) {
				printEvent(window, "scroll by %f, %f", xpos, ypos);
			}
		});

		while ( glfwWindowShouldClose(window) == 0 )
			glfwWaitEvents();
	}

	private static void printEvent(final long window, final String format, final Object... args) {
		final Object[] formatArgs = new Object[2 + args.length];

		formatArgs[0] = glfwGetTime();
		formatArgs[1] = window;
		System.arraycopy(args, 0, formatArgs, 2, args.length);

		System.out.format("%.3f: Window [%d] " + format + "%n", formatArgs);
	}

}