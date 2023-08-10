/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Contains bindings to the <a href="https://www.glfw.org/">GLFW</a> library.
 * 
 * <p>GLFW comes with extensive documentation, which you can read online <a href="https://www.glfw.org/docs/latest/">here</a>. The
 * <a href="https://www.glfw.org/faq.html">Frequently Asked Questions</a> are also useful.</p>
 * 
 * <h3>Using GLFW on macOS</h3>
 * 
 * <p>On macOS the JVM must be started with the {@code -XstartOnFirstThread} argument for GLFW to work. This is necessary because most GLFW functions must be
 * called on the main thread and the Cocoa API requires that thread to be the first thread in the process. GLFW windows and the GLFW event loop are
 * incompatible with other window toolkits (such as AWT/Swing or JavaFX).</p>
 * 
 * <p>Applications that cannot function with the above limitation may set {@link org.lwjgl.system.Configuration#GLFW_LIBRARY_NAME GLFW_LIBRARY_NAME} to the
 * value {@code "glfw_async"}. This will instruct LWJGL to load an alternative GLFW build that dispatches Cocoa calls to the main thread in blocking mode.
 * The other window toolkit must be initialized (e.g. with AWT's {@code Toolkit.getDefaultToolkit()}) before {@link org.lwjgl.glfw.GLFW#glfwInit Init} is called.</p>
 */
@org.lwjgl.system.NonnullDefault
package org.lwjgl.glfw;

