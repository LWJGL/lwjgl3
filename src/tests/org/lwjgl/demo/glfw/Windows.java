package org.lwjgl.demo.glfw;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.glfw.ErrorCallback;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.glfw.GLFW.*;
import static org.lwjgl.system.windows.GLFWWin32.glfwGetWin32Window;
import static org.lwjgl.system.windows.WinGDI.SwapBuffers;
import static org.lwjgl.system.windows.WinUser.GetDC;

/**
 * Port of https://github.com/elmindreda/glfw/blob/master/tests/windows.c
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public class Windows extends AbstractDemo {
    public static String[] titles = {"Foo", "Bar", "Baz", "Quux"};

    public static void main(String[] args) {
        Sys.touch();

        int i;
        boolean running = true;
        long[] windows = new long[4];
        GLContext[] contexts = new GLContext[4];

        if (glfwInit() != GL11.GL_TRUE) {
            System.out.println("Unable to initialize glfw");
            System.exit(-1);
        }

        glfwSetErrorCallback(new ErrorCallback() {
            @Override
            public void invoke(int error, long description) {
                LWJGLUtil.log("invoke: " + error + ", " + description);
            }

            @Override
            public void callback(int error, String description) {
                LWJGLUtil.log("callback: " + error + ", " + description);
            }
        });


        for (i = 0; i < 4; i++) {
            windows[i] = glfwCreateWindow(200, 200, titles[i], 0, 0);
            if (windows[i] == 0) {
                System.out.println("Unable to create glfw window");
                glfwTerminate();
            }

            /* need to use our context */
            long HWND = glfwGetWin32Window(windows[i]);
            long HDC = GetDC(HWND);
            contexts[i] = initializeOpenGLContext(HDC);

            glClearColor((i & 1), (i >> 1), (i == 1) ? 0.f : 1.f, 0.f);

            glfwSetWindowPos(windows[i], 100 + (i & 1) * 300, 100 + (i >> 1) * 300);
            glfwShowWindow(windows[i]);
        }

        while (running) {
            for (i = 0; i < 4; i++) {

                /* need to use our context */
                long HWND = glfwGetWin32Window(windows[i]);
                long HDC = GetDC(HWND);
                contexts[i].makeCurrent();

                glClear(GL_COLOR_BUFFER_BIT);
                SwapBuffers(HDC);

                if (glfwWindowShouldClose(windows[i]) == 1)
                    running = false;
            }

            glfwPollEvents();
        }

        glfwTerminate();
    }
}
