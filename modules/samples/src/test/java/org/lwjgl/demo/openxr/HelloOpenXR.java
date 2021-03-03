/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openxr;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.openxr.*;
import org.lwjgl.system.*;
import org.lwjgl.system.windows.*;

import java.nio.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL20C.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class HelloOpenXR {

    //XR globals
    PointerBuffer extensions;
    XrInstance    xrInstance;
    long          systemID;
    Struct        graphicsBinding;
    XrSession     xrSession;
    XrSpace       xrSpace;
    long          glFormat;
    Swapchain[]   swapchains;

    //GL globals
    int swapchainFramebuffer;
    int modelViewProjectionUniformLocation;
    int vertexAttribCoords;
    int vertexAttribColor;
    int vao;
    int cubeVertexBuffer;
    int cubeIndexBuffer;

    static class Swapchain {
        XrSwapchain                      handle;
        int                              width;
        int                              height;
        XrSwapchainImageOpenGLKHR.Buffer images;
    }

    String vertexShaderGlsl = "#version 410\n" +
                              "\n" +
                              "in vec3 VertexPos;\n" +
                              "in vec3 VertexColor;\n" +
                              "\n" +
                              "out vec3 PSVertexColor;\n" +
                              "\n" +
                              "uniform mat4 ModelViewProjection;\n" +
                              "\n" +
                              "void main() {\n" +
                              "   gl_Position = ModelViewProjection * vec4(VertexPos, 1.0);\n" +
                              "   PSVertexColor = VertexColor;\n" +
                              "}";

    String fragmentShaderGlsl = "#version 410\n" +
                                "\n" +
                                "in vec3\n" +
                                "PSVertexColor;\n" +
                                "out vec4\n" +
                                "FragColor;\n" +
                                "\n" +
                                "void main() {\n" +
                                "    FragColor = vec4(PSVertexColor, 1);\n" +
                                "}";

    public static void main(String[] args) {
        SharedLibrary XRlib;
        //TODO put openxr_loader inside the OpenXR jar file
        XRlib = Library.loadNative(XR.class, "org.lwjgl.openxr", Configuration.OPENXR_LIBRARY_NAME, "C:\\Program Files (x86)\\Steam\\steamapps\\common\\SteamVR\\bin\\win64\\openxr_loader.dll");
        System.out.printf("\"%s\" opened as OpenXR loader\n", XRlib.getPath());
        XR.create(XRlib);

        HelloOpenXR hello = new HelloOpenXR();
        hello.createOpenXRInstance();
        hello.initializeOpenXRSystem();
        hello.initializeOpenGL();
        //initialize openxr actions
        hello.initializeOpenXRSession();
        hello.createXRReferenceSpace();
        hello.createXRSwapchains();
        hello.createOpenGLResourses();

//        while (true) {
//            hello.renderFrameOpenXR();
//        }
    }

    private static long XR_MAKE_VERSION(long major, long minor, long patch) {
        return ((major & 0xffffL) << 48) | ((minor & 0xffffL) << 32) | patch;
    }

    private static ByteBuffer createAndFillVec(MemoryStack stack, int capacity, int sizeof, int type) {
        ByteBuffer b = stack.malloc(capacity * sizeof);

        for (int i = 0; i < capacity; i++) {
            b.position(i * sizeof);
            b.putInt(type);
        }
        b.rewind();
        return b;
    }

    public void createOpenXRInstance() {
        try (MemoryStack stack = stackPush()) {
            IntBuffer numExtensions = stack.mallocInt(1);
            XR10.xrEnumerateInstanceExtensionProperties((ByteBuffer)null, numExtensions, null);

            XrExtensionProperties.Buffer properties = new XrExtensionProperties.Buffer(
                createAndFillVec(stack, numExtensions.get(0), XrExtensionProperties.SIZEOF, XR10.XR_TYPE_EXTENSION_PROPERTIES)
            );

            XR10.xrEnumerateInstanceExtensionProperties((ByteBuffer)null, numExtensions, properties);

            System.out.printf("OpenXR loaded with %d extensions:%n", numExtensions.get(0));
            System.out.println("~~~~~~~~~~~~~~~~~~");
            extensions = memAllocPointer(numExtensions.get(0));
            boolean missingOpenGL = true;
            while (properties.hasRemaining()) {
                XrExtensionProperties prop          = properties.get();
                String                extensionName = prop.extensionNameString();
                System.out.println(extensionName);
                extensions.put(memASCII(extensionName));
                if (extensionName.equals(KHROpenglEnable.XR_KHR_OPENGL_ENABLE_EXTENSION_NAME)) {
                    missingOpenGL = false;
                }
            }
            extensions.rewind();
            System.out.println("~~~~~~~~~~~~~~~~~~");

            if (missingOpenGL) {
                throw new IllegalStateException("OpenXR library does not provide extension: " + KHROpenglEnable.XR_KHR_OPENGL_ENABLE_EXTENSION_NAME);
            }

            XrApplicationInfo applicationInfo = new XrApplicationInfo(stack.malloc(XrApplicationInfo.SIZEOF));
            applicationInfo.apiVersion(XR_MAKE_VERSION(1, 0, 14)); //TODO replace this with XR_CURRENT_API_VERSION
            applicationInfo.applicationName(stack.UTF8("TEST NAME"));

            XrInstanceCreateInfo createInfo = new XrInstanceCreateInfo(stack.malloc(XrInstanceCreateInfo.SIZEOF));
            createInfo.set(
                XR10.XR_TYPE_INSTANCE_CREATE_INFO,
                0,
                0,
                applicationInfo,
                null,
                extensions
            );

            PointerBuffer instancePtr = memAllocPointer(1);
            XR10.xrCreateInstance(createInfo, instancePtr);
            xrInstance = new XrInstance(instancePtr.get(0), createInfo);
        }
    }

    public void initializeOpenXRSystem() {
        try (MemoryStack stack = stackPush()) {
            //Get headset
            XrSystemGetInfo systemInfo = new XrSystemGetInfo(stack.malloc(XrSystemGetInfo.SIZEOF));
            systemInfo.set(XR10.XR_TYPE_SYSTEM_GET_INFO, 0, XR10.XR_FORM_FACTOR_HEAD_MOUNTED_DISPLAY);

            LongBuffer lBuf = stack.longs(0);
            XR10.xrGetSystem(xrInstance, systemInfo, lBuf);
            systemID = lBuf.get();
            System.out.printf("Headset found with System ID:%d\n", systemID);
        }
    }

    public void initializeOpenGL() {
        try (MemoryStack stack = stackPush()) {
            //Initialize OpenXR's OpenGL compatability
            XrGraphicsRequirementsOpenGLKHR graphicsRequirements = new XrGraphicsRequirementsOpenGLKHR(stack.malloc(XrGraphicsRequirementsOpenGLKHR.SIZEOF));
            graphicsRequirements.set(KHROpenglEnable.XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR, 0, 0, 0);
            KHROpenglEnable.xrGetOpenGLGraphicsRequirementsKHR(xrInstance, systemID, graphicsRequirements);

            //Init glfw
            if (!glfwInit()) {
                throw new IllegalStateException("Failed to initialize GLFW.");
            }
            long window = glfwCreateWindow(640, 480, "Hello World", NULL, NULL);
            glfwMakeContextCurrent(window);
            GL.createCapabilities();
            glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 4);
            glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 0);
            glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);

            //Check if OpenGL ver is supported by OpenXR ver
            IntBuffer glVersion = stack.mallocInt(2);
            GL11.glGetIntegerv(GL30.GL_MAJOR_VERSION, glVersion);
            glVersion.position(1);
            GL11.glGetIntegerv(GL30.GL_MINOR_VERSION, glVersion);
            if (graphicsRequirements.minApiVersionSupported() > XR_MAKE_VERSION(glVersion.get(0), glVersion.get(1), 0)) {
                throw new IllegalStateException("Runtime does not support desired Graphics API and/or version");
            }

            switch (Platform.get()) {
                case LINUX:
                    throw new IllegalStateException();//TODO
                case WINDOWS:
                    XrGraphicsBindingOpenGLWin32KHR graphicsBinding = new XrGraphicsBindingOpenGLWin32KHR(stack.malloc(XrGraphicsBindingOpenGLWin32KHR.SIZEOF));
                    graphicsBinding.set(
                        KHROpenglEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR,
                        NULL,
                        User32.GetDC(GLFWNativeWin32.glfwGetWin32Window(window)),
                        GLFWNativeWGL.glfwGetWGLContext(window)
                    );
                    this.graphicsBinding = graphicsBinding;
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public void initializeOpenXRSession() {
        try (MemoryStack stack = stackPush()) {
            XrSessionCreateInfo sessionCreateInfo = new XrSessionCreateInfo(stack.malloc(XrSessionCreateInfo.SIZEOF));
            sessionCreateInfo.set(
                XR10.XR_TYPE_SESSION_CREATE_INFO,
                graphicsBinding.address(),
                0,
                systemID
            );

            PointerBuffer pp = stack.mallocPointer(1);
            XR10.xrCreateSession(xrInstance, sessionCreateInfo, pp);
            xrSession = new XrSession(pp.get(0), xrInstance);
        }
    }

    public void createXRReferenceSpace() {
        try (MemoryStack stack = stackPush()) {
            XrPosef pose = new XrPosef(stack.malloc(XrPosef.SIZEOF));
            pose.set(
                new XrQuaternionf(stack.malloc(XrQuaternionf.SIZEOF)).set(0, 0, 0, 1),
                new XrVector3f(stack.calloc(XrVector3f.SIZEOF))
            );

            XrReferenceSpaceCreateInfo referenceSpaceCreateInfo = new XrReferenceSpaceCreateInfo(stack.malloc(XrReferenceSpaceCreateInfo.SIZEOF));
            referenceSpaceCreateInfo.set(
                XR10.XR_TYPE_REFERENCE_SPACE_CREATE_INFO,
                NULL,
                XR10.XR_REFERENCE_SPACE_TYPE_LOCAL,
                pose
            );
            PointerBuffer pp = stack.mallocPointer(1);
            XR10.xrCreateReferenceSpace(xrSession, referenceSpaceCreateInfo, pp);
            xrSpace = new XrSpace(pp.get(0), xrSession);
        }
    }

    public void createXRSwapchains() {
        try (MemoryStack stack = stackPush()) {
            ByteBuffer buf = stack.calloc(XrSystemProperties.SIZEOF); //need to calloc so next = 0
            buf.putInt(XR10.XR_TYPE_SYSTEM_PROPERTIES);
            buf.rewind();
            XrSystemProperties systemProperties = new XrSystemProperties(buf); //TODO make type mutable so this workaround isnt necicary
            XR10.xrGetSystemProperties(xrInstance, systemID, systemProperties);
            System.out.printf("Headset name:%s vendor:%d \n", memUTF8(systemProperties.systemName()), systemProperties.vendorId());
            XrSystemTrackingProperties trackingProperties = systemProperties.trackingProperties();
            System.out.printf("Headset orientationTracking:%b positionTracking:%b \n", trackingProperties.orientationTracking(), trackingProperties.positionTracking());
            XrSystemGraphicsProperties graphicsProperties = systemProperties.graphicsProperties();
            System.out.printf("Headset MaxWidth:%d MaxHeight:%d MaxLayerCount:%d \n", graphicsProperties.maxSwapchainImageWidth(), graphicsProperties.maxSwapchainImageHeight(), graphicsProperties.maxLayerCount());

            IntBuffer intBuf = stack.mallocInt(1);
            XR10.xrEnumerateViewConfigurationViews(xrInstance, systemID, XR10.XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO, intBuf, null);
            XrViewConfigurationView.Buffer viewConfigs = new XrViewConfigurationView.Buffer(
                createAndFillVec(stack, intBuf.get(0), XrViewConfigurationView.SIZEOF, XR10.XR_TYPE_VIEW_CONFIGURATION_VIEW)
            );
            XR10.xrEnumerateViewConfigurationViews(xrInstance, systemID, XR10.XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO, intBuf, viewConfigs);
            int viewCountNumber = intBuf.get(0);

            XrView.Buffer views = new XrView.Buffer(
                createAndFillVec(stack, viewCountNumber, XrView.SIZEOF, XR10.XR_TYPE_VIEW)
            );

            if (viewCountNumber > 0) {
                XR10.xrEnumerateSwapchainFormats(xrSession, intBuf, null);
                LongBuffer longBuf = stack.callocLong(intBuf.get(0));
                XR10.xrEnumerateSwapchainFormats(xrSession, intBuf, longBuf);

                long[] desiredSwapchainFormats = {
                    GL11.GL_RGB10_A2,
                    GL30.GL_RGBA16F,
                    // The two below should only be used as a fallback, as they are linear color formats without enough bits for color
                    // depth, thus leading to banding.
                    GL11.GL_RGBA8,
                    GL31.GL_RGBA8_SNORM
                };
                for (long iglFormat : desiredSwapchainFormats) {
                    longBuf.rewind();
                    while (longBuf.hasRemaining()) {
                        if (iglFormat == longBuf.get()) {
                            glFormat = iglFormat;
                            break;
                        }
                    }
                    if (glFormat != 0) {
                        break;
                    }
                }
                if (glFormat == 0) {
                    throw new IllegalStateException("No compatable swapchain / framebuffer format availible");
                }

                swapchains = new Swapchain[viewCountNumber];
                for (int i = 0; i < viewCountNumber; i++) {
                    XrViewConfigurationView viewConfig          = viewConfigs.get(i);
                    XrSwapchainCreateInfo   swapchainCreateInfo = new XrSwapchainCreateInfo(stack.malloc(XrSwapchainCreateInfo.SIZEOF));
                    Swapchain               swapchainWrapper    = new Swapchain();

                    int XR_SWAPCHAIN_USAGE_SAMPLED_BIT          = 0x00000020; //TODO generate these in XR10
                    int XR_SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT = 0x00000001;

                    swapchainCreateInfo.set(
                        XR10.XR_TYPE_SWAPCHAIN_CREATE_INFO,
                        NULL,
                        0,
                        XR_SWAPCHAIN_USAGE_SAMPLED_BIT | XR_SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT,
                        glFormat,
                        viewConfig.recommendedSwapchainSampleCount(),
                        viewConfig.recommendedImageRectWidth(),
                        viewConfig.recommendedImageRectHeight(),
                        1,
                        1,
                        1
                    );

                    PointerBuffer pp = stack.mallocPointer(1);
                    XR10.xrCreateSwapchain(xrSession, swapchainCreateInfo, pp);
                    swapchainWrapper.handle = new XrSwapchain(pp.get(0), xrSession);
                    swapchainWrapper.width = swapchainCreateInfo.width();
                    swapchainWrapper.height = swapchainCreateInfo.height();

                    XR10.xrEnumerateSwapchainImages(swapchainWrapper.handle, intBuf, null);
                    int imageCount = intBuf.get(0);

                    XrSwapchainImageOpenGLKHR.Buffer swapchainImageBuffer = new XrSwapchainImageOpenGLKHR.Buffer(memAlloc(XrSwapchainImageOpenGLKHR.SIZEOF * imageCount));
                    for (XrSwapchainImageOpenGLKHR image : swapchainImageBuffer) {
                        image.type(KHROpenglEnable.XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR);
                    }

                    XR10.nxrEnumerateSwapchainImages(swapchainWrapper.handle, imageCount, memAddress(intBuf), memAddress(swapchainImageBuffer)); //TODO check if there is a more friendly way to do this
                    swapchainWrapper.images = swapchainImageBuffer;
                }
            }
        }
    }

    private void createOpenGLResourses() {
        swapchainFramebuffer = GL30.glGenFramebuffers();

        int vertexShader = GL20.glCreateShader(GL20.GL_VERTEX_SHADER);
        GL20.glShaderSource(vertexShader, vertexShaderGlsl);
        GL20.glCompileShader(vertexShader);
        checkShader(vertexShader);

        int fragmentShader = GL20.glCreateShader(GL20.GL_FRAGMENT_SHADER);
        GL20.glShaderSource(fragmentShader, fragmentShaderGlsl);
        GL20.glCompileShader(fragmentShader);
        checkShader(fragmentShader);

        int program = glCreateProgram();
        GL20.glAttachShader(program, vertexShader);
        GL20.glAttachShader(program, fragmentShader);
        GL20.glLinkProgram(program);
        checkProgram(program);


        GL20.glDeleteShader(vertexShader);
        GL20.glDeleteShader(fragmentShader);

        modelViewProjectionUniformLocation = GL20.glGetUniformLocation(program, "ModelViewProjection");

        vertexAttribCoords = GL20.glGetAttribLocation(program, "VertexPos");
        vertexAttribColor = GL20.glGetAttribLocation(program, "VertexColor");

        cubeVertexBuffer = GL15.glGenBuffers();
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, cubeVertexBuffer);
        GL15.glBufferData(GL15.GL_ARRAY_BUFFER, Geometry.cubeVertices, GL15.GL_STATIC_DRAW);

        cubeIndexBuffer = GL15.glGenBuffers();
        GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, cubeIndexBuffer);
        GL15.glBufferData(GL15.GL_ELEMENT_ARRAY_BUFFER, Geometry.cubeIndices, GL15.GL_STATIC_DRAW);

        vao = GL30.glGenVertexArrays();
        GL30.glBindVertexArray(vao);
        GL20.glEnableVertexAttribArray(vertexAttribCoords);
        GL20.glEnableVertexAttribArray(vertexAttribColor);
        GL15.glBindBuffer(GL_ARRAY_BUFFER, cubeVertexBuffer);
        GL15.glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, cubeIndexBuffer);
        GL20.glVertexAttribPointer(vertexAttribCoords, 3, GL_FLOAT, false, 24, 0);
        GL20.glVertexAttribPointer(vertexAttribColor, 3, GL_FLOAT, false, 24, 12);
    }

    private static void checkShader(int shader) {
        try (MemoryStack stack = stackPush()) {
            IntBuffer r = stack.mallocInt(1);
            GL20.glGetShaderiv(shader, GL_COMPILE_STATUS, r);
            if (r.get(0) == GL11.GL_FALSE) {
                String msg = GL20.glGetShaderInfoLog(shader, 4096);
                throw new IllegalStateException("Compile shader failed: " + msg);
            }
        }
    }

    private static void checkProgram(int program) {
        try (MemoryStack stack = stackPush()) {
            IntBuffer r = stack.mallocInt(1);
            GL20.glGetProgramiv(program, GL_LINK_STATUS, r);
            if (r.get(0) == GL11.GL_FALSE) {
                String msg = GL20.glGetProgramInfoLog(program, 4096);
                throw new IllegalStateException("Link program failed: " + msg);
            }
        }
    }

    private void renderFrameOpenXR() {
        try (MemoryStack stack = stackPush()) {

            XrFrameWaitInfo frameWaitInfo = new XrFrameWaitInfo(stack.calloc(XrFrameWaitInfo.SIZEOF));
            frameWaitInfo.type(XR10.XR_TYPE_FRAME_WAIT_INFO);
            XrFrameState frameState = new XrFrameState(stack.calloc(XrFrameState.SIZEOF));
            frameState.type(XR10.XR_TYPE_FRAME_STATE);
            XR10.xrWaitFrame(xrSession, frameWaitInfo, frameState);

            XrFrameBeginInfo frameBeginInfo = new XrFrameBeginInfo(stack.calloc(XrFrameBeginInfo.SIZEOF));
            frameBeginInfo.type(XR10.XR_TYPE_FRAME_BEGIN_INFO);
            XR10.xrBeginFrame(xrSession, frameBeginInfo);

            XrCompositionLayerBaseHeader.Buffer layers;
            XrCompositionLayerProjection layer = new XrCompositionLayerProjection(stack.calloc(XrCompositionLayerProjection.SIZEOF));
            layer.type(XR10.XR_TYPE_COMPOSITION_LAYER_PROJECTION);
            XrCompositionLayerProjectionView.Buffer projectionLayerViews;
//            if (frameState.shouldRender()) {
//                if (OpenXRRenderLayer(frameState.predictedDisplayTime(), projectionLayerViews, layer)) {
//                    layers.push_back(reinterpret_cast<XrCompositionLayerBaseHeader*>(&layer));
//                }
//            }

            XrFrameEndInfo frameEndInfo = new XrFrameEndInfo(stack.malloc(XrFrameEndInfo.SIZEOF));
            frameEndInfo.set(
                XR10.XR_TYPE_FRAME_END_INFO,
                0,
                frameState.predictedDisplayTime(),
                XR10.XR_ENVIRONMENT_BLEND_MODE_OPAQUE, //TODO
//                layers.capacity(),
//                layers
                0,
                null
            );
            XR10.xrEndFrame(xrSession, frameEndInfo);
        }
    }

    private static class Geometry {

        static float[] cubeVertices = {
            -0.5f, 0.5f, -0.5f, 0.25f, 0f, 0f, -0.5f, -0.5f, 0.5f, 0.25f, 0f, 0f, -0.5f, -0.5f, -0.5f, 0.25f, 0f, 0f, -0.5f, 0.5f, -0.5f, 0.25f, 0f, 0f, -0.5f, 0.5f, 0.5f, 0.25f, 0f, 0f, -0.5f, -0.5f, 0.5f, 0.25f, 0f, 0f,
            0.5f, 0.5f, -0.5f, 1f, 0f, 0f, 0.5f, -0.5f, -0.5f, 1f, 0f, 0f, 0.5f, -0.5f, 0.5f, 1f, 0f, 0f, 0.5f, 0.5f, -0.5f, 1f, 0f, 0f, 0.5f, -0.5f, 0.5f, 1f, 0f, 0f, 0.5f, 0.5f, 0.5f, 1f, 0f, 0f,
            -0.5f, -0.5f, -0.5f, 0f, 0.25f, 0f, -0.5f, -0.5f, 0.5f, 0f, 0.25f, 0f, 0.5f, -0.5f, 0.5f, 0f, 0.25f, 0f, -0.5f, -0.5f, -0.5f, 0f, 0.25f, 0f, 0.5f, -0.5f, 0.5f, 0f, 0.25f, 0f, 0.5f, -0.5f, -0.5f, 0f, 0.25f, 0f,
            -0.5f, 0.5f, -0.5f, 0f, 1f, 0f, 0.5f, 0.5f, -0.5f, 0f, 1f, 0f, 0.5f, 0.5f, 0.5f, 0f, 1f, 0f, -0.5f, 0.5f, -0.5f, 0f, 1f, 0f, 0.5f, 0.5f, 0.5f, 0f, 1f, 0f, -0.5f, 0.5f, 0.5f, 0f, 1f, 0f,
            -0.5f, -0.5f, -0.5f, 0f, 0f, 0.25f, 0.5f, -0.5f, -0.5f, 0f, 0f, 0.25f, 0.5f, 0.5f, -0.5f, 0f, 0f, 0.25f, -0.5f, -0.5f, -0.5f, 0f, 0f, 0.25f, 0.5f, 0.5f, -0.5f, 0f, 0f, 0.25f, -0.5f, 0.5f, -0.5f, 0f, 0f, 0.25f,
            -0.5f, -0.5f, 0.5f, 0f, 0f, 1f, -0.5f, 0.5f, 0.5f, 0f, 0f, 1f, 0.5f, 0.5f, 0.5f, 0f, 0f, 1f, -0.5f, -0.5f, 0.5f, 0f, 0f, 1f, 0.5f, 0.5f, 0.5f, 0f, 0f, 1f, 0.5f, -0.5f, 0.5f, 0f, 0f, 1f
        };

        // Winding order is clockwise. Each side uses a different color.
        static short[] cubeIndices = {
            0, 1, 2, 3, 4, 5,
            6, 7, 8, 9, 10, 11,
            12, 13, 14, 15, 16, 17,
            18, 19, 20, 21, 22, 23,
            24, 25, 26, 27, 28, 29,
            30, 31, 32, 33, 34, 35,
        };
    }
}