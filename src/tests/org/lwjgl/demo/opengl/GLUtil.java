package org.lwjgl.demo.opengl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.opengl.*;

import static org.lwjgl.opengl.AMDDebugOutput.*;
import static org.lwjgl.opengl.ARBDebugOutput.*;
import static org.lwjgl.opengl.GL43.*;

public final class GLUtil {

	private GLUtil() {
	}

	public static void debugSetupCallback(ContextCapabilities caps) {
		if ( caps.OpenGL43 ) {
			LWJGLUtil.log("[GL] Using OpenGL 4.3 for error logging.");
			glDebugMessageCallback(DEBUGPROC.Util.getDefault());
		} else if ( caps.GL_KHR_debug ) {
			LWJGLUtil.log("[GL] Using KHR_debug for error logging.");
			KHRDebug.glDebugMessageCallback(DEBUGPROC.Util.getDefault());
		} else if ( caps.GL_ARB_debug_output ) {
			LWJGLUtil.log("[GL] Using ARB_debug_output for error logging.");
			glDebugMessageCallbackARB(DEBUGPROCARB.Util.getDefault());
		} else if ( caps.GL_AMD_debug_output ) {
			LWJGLUtil.log("[GL] Using AMD_debug_output for error logging.");
			glDebugMessageCallbackAMD(DEBUGPROCAMD.Util.getDefault());
		} else
			LWJGLUtil.log("[GL] No debug output implementation is available.");
	}

}