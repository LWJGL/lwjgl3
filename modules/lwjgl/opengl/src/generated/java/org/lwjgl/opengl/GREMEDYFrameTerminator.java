/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/GREMEDY/GREMEDY_frame_terminator.txt">GREMEDY_frame_terminator</a> extension.
 * 
 * <p>This extension defines a mechanism that enables marking the end of render frames within the OpenGL stream.</p>
 * 
 * <p>When debugging or profiling an OpenGL application, the debuggers and profilers needs to know when a render frame is ended. This is important for frame
 * per second measurements, statistical analysis, marking and clearing stream loggers logs, performance counters sampling and more.</p>
 * 
 * <p>When an application uses off screen buffers, the debugger / profiler cannot be guaranteed that the application will call a certain function at the end
 * of each off-screen frame (e.g: SwapBuffers / glClear / etc). This extension enables the application to notify the debugger / profiler whenever a render
 * frame is ended.</p>
 * 
 * <p>This extension is mainly useful for debuggers and profilers. It is not expected that standard drivers would implement this extension. The main point of
 * having this extension is to allow applications to have a clean way of accessing this functionality only when they are run under the control of a
 * debugger / profiler, without having to recompile or change the application source code.</p>
 */
public class GREMEDYFrameTerminator {

    static { GL.initialize(); }

    protected GREMEDYFrameTerminator() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFrameTerminatorGREMEDY ] ---

    /**
     * Can be used to insert a frame terminator marker into the command stream. This frame terminator marker can be used by appropriate debugging tools /
     * profiling tools / profiling drivers for frame per second measurements, statistical analysis, marking and clearing stream loggers logs, performance
     * counters sampling and more. This command has no influence on the rendered image or the OpenGL state.
     */
    public static native void glFrameTerminatorGREMEDY();

}