/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.opencl;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opencl.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.*;
import java.util.concurrent.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.InfoUtil.*;
import static org.lwjgl.opencl.KHRICD.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/*
        THIS DEMO USES CODE PORTED FROM JogAmp.org
		Original code: http://github.com/mbien/jocl-demos
		Original author: Michael Bien

   ___         ___                      ___
	  /  /\       /  /\         ___        /  /\    http://jocl.jogamp.org/
	 /  /:/      /  /::\       /__/\      /  /::\   a http://jogamp.org/ project.
	/__/::\     /  /:/\:\      \  \:\    /  /:/\:\
	\__\/\:\   /  /:/~/::\      \  \:\  /  /:/~/::\
	   \  \:\ /__/:/ /:/\:\ ___  \__\:\/__/:/ /:/\:\
		\__\:\\  \:\/:/__\//__/\ |  |:|\  \:\/:/__\/
		/  /:/ \  \::/     \  \:\|  |:| \  \::/
	   /__/:/   \  \:\      \  \:\__|:|  \  \:\
	   \__\/     \  \:\      \__\::::/    \  \:\
				  \__\/          ~~~~      \__\/
			   ___          ___       ___          ___          ___
			  /  /\        /  /\     /  /\        /__/\        /  /\
			 /  /::\      /  /::\   /  /:/_       \  \:\      /  /:/
			/  /:/\:\    /  /:/\:\ /  /:/ /\       \  \:\    /  /:/      ___     ___
		   /  /:/  \:\  /  /:/~/://  /:/ /:/_  _____\__\:\  /  /:/  ___ /__/\   /  /\
		  /__/:/ \__\:\/__/:/ /://__/:/ /:/ /\/__/::::::::\/__/:/  /  /\\  \:\ /  /:/
		  \  \:\ /  /:/\  \:\/:/ \  \:\/:/ /:/\  \:\~~\~~\/\  \:\ /  /:/ \  \:\  /:/
		   \  \:\  /:/  \  \::/   \  \::/ /:/  \  \:\  ~~~  \  \:\  /:/   \  \:\/:/
			\  \:\/:/    \  \:\    \  \:\/:/    \  \:\       \  \:\/:/     \  \::/
			 \  \::/      \  \:\    \  \::/      \  \:\       \  \::/       \__\/
			  \__\/        \__\/     \__\/        \__\/        \__\/

		 _____          ___           ___           ___           ___
		/  /::\        /  /\         /__/\         /  /\         /  /\
	   /  /:/\:\      /  /:/_       |  |::\       /  /::\       /  /:/_
	  /  /:/  \:\    /  /:/ /\      |  |:|:\     /  /:/\:\     /  /:/ /\
	 /__/:/ \__\:|  /  /:/ /:/_   __|__|:|\:\   /  /:/  \:\   /  /:/ /::\
	 \  \:\ /  /:/ /__/:/ /:/ /\ /__/::::| \:\ /__/:/ \__\:\ /__/:/ /:/\:\
	  \  \:\  /:/  \  \:\/:/ /:/ \  \:\~~\__\/ \  \:\ /  /:/ \  \:\/:/~/:/
	   \  \:\/:/    \  \::/ /:/   \  \:\        \  \:\  /:/   \  \::/ /:/
		\  \::/      \  \:\/:/     \  \:\        \  \:\/:/     \__\/ /:/
		 \__\/        \  \::/       \  \:\        \  \::/        /__/:/
					   \__\/         \__\/         \__\/         \__\/
*/

public final class CLGLInteropDemo {

    private static final Set<String> params = new HashSet<>(8);

    // max per pixel iterations to compute the fractal
    private static int maxIterations = 500;

    private static int initWidth  = 512;
    private static int initHeight = 512;

    // ------------------

    private CLGLInteropDemo() {
    }

    public static void main(String... args) {
        parseArgs(args);

        glfwSetErrorCallback(GLFWErrorCallback.createPrint());
        if (!glfwInit()) {
            System.out.println("Unable to initialize glfw");
            System.exit(-1);
        }

        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
        if (Platform.get() == Platform.MACOSX) {
            glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 2);
            glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        } else {
            glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 1);
        }
        glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GLFW_TRUE);
        boolean debugGL = params.contains("debugGL");
        if (debugGL) {
            glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);
        }

        List<Long> platforms;

        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.mallocInt(1);
            checkCLError(clGetPlatformIDs(null, pi));
            if (pi.get(0) == 0) {
                throw new IllegalStateException("No OpenCL platforms found.");
            }

            PointerBuffer platformIDs = stack.mallocPointer(pi.get(0));
            checkCLError(clGetPlatformIDs(platformIDs, (IntBuffer)null));

            platforms = new ArrayList<>(platformIDs.capacity());

            for (int i = 0; i < platformIDs.capacity(); i++) {
                long           platform = platformIDs.get(i);
                CLCapabilities caps     = CL.createPlatformCapabilities(platform);
                if (caps.cl_khr_gl_sharing || caps.cl_APPLE_gl_sharing) {
                    platforms.add(platform);
                }
            }
        }

        if (platforms.isEmpty()) {
            throw new IllegalStateException("No OpenCL platform found that supports OpenGL context sharing.");
        }

        Collections.sort(platforms, (p1, p2) -> {
            // Prefer platforms that support GPU devices
            boolean gpu1 = !getDevices(p1, CL_DEVICE_TYPE_GPU).isEmpty();
            boolean gpu2 = !getDevices(p2, CL_DEVICE_TYPE_GPU).isEmpty();
            int     cmp  = gpu1 == gpu2 ? 0 : (gpu1 ? -1 : 1);
            if (cmp != 0) {
                return cmp;
            }

            return getPlatformInfoStringUTF8(p1, CL_PLATFORM_VENDOR).compareTo(getPlatformInfoStringUTF8(p2, CL_PLATFORM_VENDOR));
        });

        long           platform     = platforms.get(0);
        CLCapabilities platformCaps = CL.createPlatformCapabilities(platform);

        String platformID;
        if (platformCaps.cl_khr_icd) {
            platformID = getPlatformInfoStringASCII(platform, CL_PLATFORM_ICD_SUFFIX_KHR); // less spammy
        } else {
            platformID = getPlatformInfoStringUTF8(platform, CL_PLATFORM_VENDOR);
        }

        boolean hasCPU = false;
        boolean hasGPU = false;
        for (Long device : getDevices(platform, CL_DEVICE_TYPE_ALL)) {
            long type = getDeviceInfoLong(device, CL_DEVICE_TYPE);
            if (type == CL_DEVICE_TYPE_CPU) {
                hasCPU = true;
            } else if (type == CL_DEVICE_TYPE_GPU) {
                hasGPU = true;
            }
        }

        Thread[]     threads = new Thread[hasCPU && hasGPU ? 2 : 1];
        GLFWWindow[] windows = new GLFWWindow[threads.length];

        CountDownLatch latch   = new CountDownLatch(windows.length);
        CyclicBarrier  barrier = new CyclicBarrier(windows.length + 1);

        for (int i = 0; i < threads.length; i++) {
            int deviceType = i == 1 || !hasGPU ? CL_DEVICE_TYPE_CPU : CL_DEVICE_TYPE_GPU;

            String     ID     = platformID + " - " + (deviceType == CL_DEVICE_TYPE_CPU ? "CPU" : "GPU");
            GLFWWindow window = new GLFWWindow(glfwCreateWindow(initWidth, initHeight, ID, NULL, NULL), ID, new CountDownLatch(1));
            glfwSetWindowPos(window.handle, 200 + initWidth * i + 32 * i, 200);

            windows[i] = window;
            threads[i] = new Thread(platformID) {
                @Override
                public void run() {
                    Mandelbrot demo = null;
                    try {
                        demo = new Mandelbrot(platform, platformCaps, window, deviceType, debugGL, maxIterations);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    try {
                        barrier.await();
                        if (demo != null) {
                            demo.renderLoop();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        latch.countDown();
                    }
                }
            };
            threads[i].start();
        }

        try {
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < windows.length; i++) {
            glfwShowWindow(windows[i].handle);
        }

        System.out.println("GAME ON!");

        while (latch.getCount() != 0) {
            glfwPollEvents();

            for (int i = 0; i < windows.length; i++) {
                if (windows[i] != null && windows[i].signal.getCount() == 0) {
                    windows[i].destroy();
                    windows[i] = null;
                }
            }
        }

        CL.destroy();
        glfwTerminate();
        glfwSetErrorCallback(null).free();

        System.out.println("GAME OVER!");
    }

    private static void parseArgs(String... args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (arg.charAt(0) != '-' && arg.charAt(0) != '/') {
                throw new IllegalArgumentException("Invalid command-line argument: " + args[i]);
            }

            String param = arg.substring(1);

            if ("forceCPU".equalsIgnoreCase(param)) {
                params.add("forceCPU");
            } else if ("debugGL".equalsIgnoreCase(param)) {
                params.add("debugGL");
            } else if ("iterations".equalsIgnoreCase(param)) {
                if (args.length < i + 1 + 1) {
                    throw new IllegalArgumentException("Invalid iterations argument specified.");
                }

                try {
                    maxIterations = Integer.parseInt(args[++i]);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid number of iterations specified.");
                }
            } else if ("res".equalsIgnoreCase(param)) {
                if (args.length < i + 2 + 1) {
                    throw new IllegalArgumentException("Invalid res argument specified.");
                }

                try {
                    initWidth = Integer.parseInt(args[++i]);
                    initHeight = Integer.parseInt(args[++i]);

                    if (initWidth < 1 || initHeight < 1) {
                        throw new IllegalArgumentException("Invalid res dimensions specified.");
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid res dimensions specified.");
                }
            }
        }
    }

    private static List<Long> getDevices(long platform, int deviceType) {
        List<Long> devices;
        try (MemoryStack stack = stackPush()) {
            IntBuffer pi      = stack.mallocInt(1);
            int       errcode = clGetDeviceIDs(platform, deviceType, null, pi);
            if (errcode == CL_DEVICE_NOT_FOUND) {
                devices = Collections.emptyList();
            } else {
                checkCLError(errcode);

                PointerBuffer deviceIDs = stack.mallocPointer(pi.get(0));
                checkCLError(clGetDeviceIDs(platform, deviceType, deviceIDs, (IntBuffer)null));

                devices = new ArrayList<>(deviceIDs.capacity());

                for (int i = 0; i < deviceIDs.capacity(); i++) {
                    devices.add(deviceIDs.get(i));
                }
            }
        }

        return devices;
    }

    static class GLFWWindow {

        final long handle;

        final String ID;

        /** Used to signal that the rendering thread has completed. */
        final CountDownLatch signal;

        GLFWWindowSizeCallback      windowsizefun;
        GLFWFramebufferSizeCallback framebuffersizefun;
        GLFWKeyCallback             keyfun;
        GLFWMouseButtonCallback     mousebuttonfun;
        GLFWCursorPosCallback       cursorposfun;
        GLFWScrollCallback          scrollfun;

        private GLFWWindow(long handle, String ID, CountDownLatch signal) {
            this.handle = handle;
            this.ID = ID;
            this.signal = signal;
        }

        void destroy() {
            glfwFreeCallbacks(handle);
            glfwDestroyWindow(handle);
        }

    }

}