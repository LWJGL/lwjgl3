package org.lwjgl.demo.glfw;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR;
import org.lwjgl.system.windows.WindowsDisplay;
import org.lwjgl.system.windows.opengl.WindowsGLContext;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static org.lwjgl.opengl.GL11.GL_FALSE;
import static org.lwjgl.opengl.GL11.GL_TRUE;
import static org.lwjgl.opengl.WGLARBMultisample.WGL_SAMPLES_ARB;
import static org.lwjgl.opengl.WGLARBMultisample.WGL_SAMPLE_BUFFERS_ARB;
import static org.lwjgl.opengl.WGLARBPixelFormat.*;
import static org.lwjgl.system.windows.WGL.*;
import static org.lwjgl.system.windows.WinGDI.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Abstract demo class to hide the nasty stuff
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public class AbstractDemo {

    protected static int findPixelFormatLegacy(long dc, ByteBuffer pfdOut) {
        ByteBuffer pfdIn = PIXELFORMATDESCRIPTOR.malloc();

        PIXELFORMATDESCRIPTOR.sizeSet(pfdIn, PIXELFORMATDESCRIPTOR.SIZEOF);
        PIXELFORMATDESCRIPTOR.versionSet(pfdIn, 1);
        PIXELFORMATDESCRIPTOR.flagsSet(pfdIn, PFD_DRAW_TO_WINDOW | PFD_SUPPORT_OPENGL | PFD_DOUBLEBUFFER);
        PIXELFORMATDESCRIPTOR.pixelTypeSet(pfdIn, PFD_TYPE_RGBA);
        PIXELFORMATDESCRIPTOR.colorBitsSet(pfdIn, 24);
        PIXELFORMATDESCRIPTOR.alphaBitsSet(pfdIn, 8);
        PIXELFORMATDESCRIPTOR.depthBitsSet(pfdIn, 24);
        PIXELFORMATDESCRIPTOR.stencilBitsSet(pfdIn, 8);

        int pixelFormat = ChoosePixelFormat(dc, pfdIn);
        assertTrue(pixelFormat != 0);

        int describePF = DescribePixelFormat(dc, pixelFormat, pfdOut);
        assertTrue(describePF != 0);

        int flagsOut = PIXELFORMATDESCRIPTOR.flagsGet(pfdOut);

        assertEquals(flagsOut & PFD_DRAW_TO_WINDOW, PFD_DRAW_TO_WINDOW);
        assertEquals(flagsOut & PFD_SUPPORT_OPENGL, PFD_SUPPORT_OPENGL);
        assertEquals(flagsOut & PFD_DOUBLEBUFFER, PFD_DOUBLEBUFFER);
        assertEquals(flagsOut & PFD_GENERIC_FORMAT, 0); // software mode
        assertTrue(PIXELFORMATDESCRIPTOR.colorBitsGet(pfdIn) <= PIXELFORMATDESCRIPTOR.colorBitsGet(pfdOut));
        assertTrue(PIXELFORMATDESCRIPTOR.alphaBitsGet(pfdIn) <= PIXELFORMATDESCRIPTOR.alphaBitsGet(pfdOut));
        assertTrue(PIXELFORMATDESCRIPTOR.depthBitsGet(pfdIn) <= PIXELFORMATDESCRIPTOR.depthBitsGet(pfdOut));
        assertTrue(PIXELFORMATDESCRIPTOR.stencilBitsGet(pfdIn) <= PIXELFORMATDESCRIPTOR.stencilBitsGet(pfdOut));

        return pixelFormat;
    }

    protected static void add(IntBuffer properties, int key, int value) {
        properties.put(key);
        properties.put(value);
    }

    protected static int findPixelFormatARB(int pixelFormat, ByteBuffer pfd) {
        long pushDC = wglGetCurrentDC();
        long pushGLRC = wglGetCurrentContext();

        WindowsDisplay dummy = new WindowsDisplay();
        dummy.setVisible(true);

        int success = SetPixelFormat(dummy.getHdc(), pixelFormat, pfd);
        assertTrue(success != 0);

        GLContext context = WindowsGLContext.create(dummy.getHdc());

        IntBuffer propList = BufferUtils.createIntBuffer(32);

        add(propList, WGL_SUPPORT_OPENGL_ARB, GL_TRUE);
        add(propList, WGL_ACCELERATION_ARB, WGL_FULL_ACCELERATION_ARB);
        add(propList, WGL_DRAW_TO_WINDOW_ARB, GL_TRUE);
        add(propList, WGL_DOUBLE_BUFFER_ARB, GL_TRUE);
        add(propList, WGL_STEREO_ARB, GL_FALSE);
        add(propList, WGL_SAMPLE_BUFFERS_ARB, 0);
        add(propList, WGL_SAMPLES_ARB, 0);

        add(propList, WGL_PIXEL_TYPE_ARB, WGL_TYPE_RGBA_ARB);
        add(propList, WGL_RED_BITS_ARB, 8);
        add(propList, WGL_GREEN_BITS_ARB, 8);
        add(propList, WGL_BLUE_BITS_ARB, 8);
        add(propList, WGL_ALPHA_BITS_ARB, 8);
        add(propList, WGL_DEPTH_BITS_ARB, 24);
        add(propList, WGL_STENCIL_BITS_ARB, 8);

        propList.put(0);
        propList.flip();

        IntBuffer pixelFormatNum = BufferUtils.createIntBuffer(1);

        success = wglGetPixelFormatAttribiARB(dummy.getHdc(), 0, 0, WGL_NUMBER_PIXEL_FORMATS_ARB, pixelFormatNum);
        assertTrue(success != 0);

        IntBuffer pixelFormatRet = BufferUtils.createIntBuffer(pixelFormatNum.get(0));

        success = wglChoosePixelFormatARB(dummy.getHdc(), propList, null, pixelFormatRet, pixelFormatNum);
        assertTrue(success != 0);
        assertTrue(1 <= pixelFormatNum.get(0));

        pixelFormat = pixelFormatRet.get(0);

        context.destroy();
        dummy.destroy();

        wglMakeCurrent(pushDC, pushGLRC);

        return pixelFormat;
    }

    protected static GLContext initializeOpenGLContext(long HDC) {
        ByteBuffer pfdOut = PIXELFORMATDESCRIPTOR.malloc();
        int pixelFormat = findPixelFormatLegacy(HDC, pfdOut);
        pixelFormat = findPixelFormatARB(pixelFormat, pfdOut);
        SetPixelFormat(HDC, pixelFormat, pfdOut);
        GLContext context = WindowsGLContext.create(HDC);
        System.out.println("context: " + context + " for HDC: " + HDC);
        return context;
    }
}
