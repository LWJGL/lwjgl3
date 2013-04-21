package org.lwjgl.demo.glfw;

import org.lwjgl.Sys;
import org.lwjgl.system.glfw.ErrorCallback;
import org.lwjgl.system.glfw.MonitorCallback;
import org.lwjgl.system.glfw.WindowCallback;

import static org.lwjgl.system.glfw.GLFW.*;

/** GLFW events demo. */
public final class Events {

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
		glfwDefaultWindowHints();
		long window = glfwCreateWindow(640, 480, "GLFW Event Demo", 0L, 0L);
		if ( window == 0L )
			throw new IllegalStateException("Failed to create GLFW window.");

		System.out.println("Window opened.");

		glfwSetMonitorCallback(new MonitorCallback() {
			@Override
			public void invoke(long monitor, int event) {
				System.out.println("Monitor " + monitor + " was " + (event == 0x00061000 ? "connected" : "disconnected"));
			}
		});

		WindowCallback.set(window, new WindowCallback() {
			@Override
			public void windowPos(long window, int xpos, int ypos) {
				printEvent(window, "moved to %d, %d", xpos, ypos);
			}

			@Override
			public void windowSize(long window, int width, int height) {
				printEvent(window, "resized to %d x %d", width, height);
			}

			@Override
			public void windowClose(long window) {
				printEvent(window, "closed");
			}

			@Override
			public void windowRefresh(long window) {
				printEvent(window, "refreshed");
			}

			@Override
			public void windowFocus(long window, int focused) {
				printEvent(window, focused == 0 ? "lost focus" : "gained focus");
			}

			@Override
			public void windowIconify(long window, int iconified) {
				printEvent(window, iconified == 0 ? "restored" : "iconified");
			}

			@Override
			public void key(long window, int key, int action) {
				String state;
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
					glfwSetWindowShouldClose(window, 1);
			}

			@Override
			public void character(long window, int character) {
				printEvent(window, "character %s", Character.toString((char)character));
			}

			@Override
			public void mouseButton(long window, int button, int action) {
				String state;
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
			public void cursorPos(long window, double xpos, double ypos) {
				printEvent(window, "cursor moved to %f, %f", xpos, ypos);
			}

			@Override
			public void cursorEnter(long window, int entered) {
				printEvent(window, "cursor %s", entered == 0 ? "left" : "entered");
			}

			@Override
			public void scroll(long window, double xpos, double ypos) {
				printEvent(window, "scroll by %f, %f", xpos, ypos);
			}
		});

		while ( glfwWindowShouldClose(window) == 0 )
			glfwWaitEvents();
	}

	private static void printEvent(long window, String format, Object... args) {
		Object[] formatArgs = new Object[2 + args.length];

		formatArgs[0] = glfwGetTime();
		formatArgs[1] = window;
		System.arraycopy(args, 0, formatArgs, 2, args.length);

		System.out.format("%.3f: Window [%d] " + format + "%n", formatArgs);
	}

}