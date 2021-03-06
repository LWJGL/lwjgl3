/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openxr;

import org.joml.*;
import org.joml.Math;
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.openxr.*;
import org.lwjgl.system.*;
import org.lwjgl.system.windows.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class HelloOpenXR {

    long window;

    //XR globals
    //Init
    XrInstance                     xrInstance;
    long                           systemID;
    Struct                         graphicsBinding;
    XrSession                      xrSession;
    XrSpace                        xrAppSpace;  //The real world space in which the program runs
    long                           glColorFormat;
    XrView.Buffer                  views;       //Each view reperesents an eye in the headset with views[0] being left and views[1] being right
    Swapchain[]                    swapchains;  //One swapchain per view
    XrViewConfigurationView.Buffer viewConfigs;
    int                            viewConfigType = XR10.XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO;

    //Runtime
    XrEventDataBuffer eventDataBuffer;
    int               sessionState;
    boolean           sessionRunning;

    //GL globals
    Map<XrSwapchainImageOpenGLKHR, Integer> depthTextures; //Swapchain images only provide a color texture so we have to create depth textures seperatley

    int swapchainFramebuffer;
    int cubeVertexBuffer;
    int cubeIndexBuffer;
    int quadVertexBuffer;
    int cubeVAO;
    int quadVAO;
    int screenShader;
    int textureShader;
    int colorShader;

    static class Swapchain {
        XrSwapchain                      handle;
        int                              width;
        int                              height;
        XrSwapchainImageOpenGLKHR.Buffer images;
    }

    public static void main(String[] args) throws InterruptedException {
        SharedLibrary defaultOpenXRLoader = Library.loadNative(XR.class, "org.lwjgl.openxr", Configuration.OPENXR_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("openxr_loader.dll")), true);
        XR.create(defaultOpenXRLoader);

        HelloOpenXR helloOpenXR = new HelloOpenXR();
        helloOpenXR.createOpenXRInstance();
        helloOpenXR.initializeOpenXRSystem();
        helloOpenXR.initializeAndBindOpenGL();
        //initialize openxr actions
        helloOpenXR.createXRReferenceSpace();
        helloOpenXR.createXRSwapchains();
        helloOpenXR.createOpenGLResourses();

        helloOpenXR.eventDataBuffer = XrEventDataBuffer.calloc();
        helloOpenXR.eventDataBuffer.type(XR10.XR_TYPE_EVENT_DATA_BUFFER);
        while (!helloOpenXR.pollEvents() && !glfwWindowShouldClose(helloOpenXR.window)) {
            if (helloOpenXR.sessionRunning) {
                helloOpenXR.renderFrameOpenXR();
            } else {
                // Throttle loop since xrWaitFrame won't be called.
                Thread.sleep(250);
            }
        }

        //Destroy OpenXR
        helloOpenXR.eventDataBuffer.free();
        helloOpenXR.graphicsBinding.free();
        helloOpenXR.views.free();
        helloOpenXR.viewConfigs.free();
        for (Swapchain swapchain : helloOpenXR.swapchains) {
            swapchain.images.free();
        }

        //Destroy OpenGL
        for (int texture : helloOpenXR.depthTextures.values()) {
            glDeleteTextures(texture);
        }
        glDeleteFramebuffers(helloOpenXR.swapchainFramebuffer);
        glDeleteBuffers(helloOpenXR.cubeVertexBuffer);
        glDeleteBuffers(helloOpenXR.cubeIndexBuffer);
        glDeleteBuffers(helloOpenXR.quadVertexBuffer);
        glDeleteVertexArrays(helloOpenXR.cubeVAO);
        glDeleteVertexArrays(helloOpenXR.quadVAO);
        glDeleteProgram(helloOpenXR.screenShader);
        glDeleteProgram(helloOpenXR.textureShader);
        glDeleteProgram(helloOpenXR.colorShader);
        glfwTerminate();
    }

    /**
     * Creates an array of XrStructs with their types pre set to @param type
     */
    private static ByteBuffer mallocAndFillBufferStack(int capacity, int sizeof, int type) {
        ByteBuffer b = stackMalloc(capacity * sizeof);

        for (int i = 0; i < capacity; i++) {
            b.position(i * sizeof);
            b.putInt(type);
        }
        b.rewind();
        return b;
    }

    private static ByteBuffer mallocAndFillBufferUnsafe(int capacity, int sizeof, int type) {
        ByteBuffer b = memAlloc(capacity * sizeof);

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
                mallocAndFillBufferStack(numExtensions.get(0), XrExtensionProperties.SIZEOF, XR10.XR_TYPE_EXTENSION_PROPERTIES)
            );

            XR10.xrEnumerateInstanceExtensionProperties((ByteBuffer)null, numExtensions, properties);

            System.out.printf("OpenXR loaded with %d extensions:%n", numExtensions.get(0));
            System.out.println("~~~~~~~~~~~~~~~~~~");
            PointerBuffer extensions    = stack.mallocPointer(numExtensions.get(0));
            boolean       missingOpenGL = true;
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
                throw new IllegalStateException("OpenXR library does not provide required extension: " + KHROpenglEnable.XR_KHR_OPENGL_ENABLE_EXTENSION_NAME);
            }

            XrApplicationInfo applicationInfo = XrApplicationInfo.mallocStack();
            applicationInfo.apiVersion(XR10.XR_CURRENT_API_VERSION);
            applicationInfo.applicationName(stack.UTF8("TEST NAME"));

            XrInstanceCreateInfo createInfo = XrInstanceCreateInfo.mallocStack();
            createInfo.set(
                XR10.XR_TYPE_INSTANCE_CREATE_INFO,
                0,
                0,
                applicationInfo,
                null,
                extensions
            );

            PointerBuffer instancePtr = stack.mallocPointer(1);
            XR10.xrCreateInstance(createInfo, instancePtr);
            xrInstance = new XrInstance(instancePtr.get(0), createInfo);
        }
    }

    public void initializeOpenXRSystem() {
        try (MemoryStack stack = stackPush()) {
            //Get headset
            XrSystemGetInfo systemInfo = XrSystemGetInfo.mallocStack();
            systemInfo.set(XR10.XR_TYPE_SYSTEM_GET_INFO, 0, XR10.XR_FORM_FACTOR_HEAD_MOUNTED_DISPLAY);

            LongBuffer lBuf = stack.longs(0);
            XR10.xrGetSystem(xrInstance, systemInfo, lBuf);
            systemID = lBuf.get();
            System.out.printf("Headset found with System ID:%d\n", systemID);
        }
    }

    public void initializeAndBindOpenGL() {
        try (MemoryStack stack = stackPush()) {
            //Initialize OpenXR's OpenGL compatability
            XrGraphicsRequirementsOpenGLKHR graphicsRequirements = XrGraphicsRequirementsOpenGLKHR.mallocStack();
            graphicsRequirements.set(KHROpenglEnable.XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR, 0, 0, 0);
            KHROpenglEnable.xrGetOpenGLGraphicsRequirementsKHR(xrInstance, systemID, graphicsRequirements);

            //Init glfw
            if (!glfwInit()) {
                throw new IllegalStateException("Failed to initialize GLFW.");
            }
            window = glfwCreateWindow(640, 480, "Hello World", NULL, NULL);
            glfwMakeContextCurrent(window);
            glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 4);
            glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 0);
            glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
            glfwSwapInterval(0);
            GL.createCapabilities();

            //Check if OpenGL ver is supported by OpenXR ver
            if (graphicsRequirements.minApiVersionSupported() > XR10.XR_MAKE_VERSION(GL11.glGetInteger(GL30.GL_MAJOR_VERSION), GL11.glGetInteger(GL30.GL_MINOR_VERSION), 0)) {
                throw new IllegalStateException("Runtime does not support desired Graphics API and/or version");
            }

            //Bind the OpenGL context to the OpenXR instance and create the session
            switch (Platform.get()) {
                case LINUX:
                    throw new IllegalStateException();//TODO
                case WINDOWS:
                    XrGraphicsBindingOpenGLWin32KHR graphicsBinding = new XrGraphicsBindingOpenGLWin32KHR(memAlloc(XrGraphicsBindingOpenGLWin32KHR.SIZEOF));
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

            XrSessionCreateInfo sessionCreateInfo = XrSessionCreateInfo.mallocStack();
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
            XrPosef identityPose = XrPosef.mallocStack();
            identityPose.set(
                XrQuaternionf.mallocStack().set(0, 0, 0, 1),
                XrVector3f.callocStack()
            );

            XrReferenceSpaceCreateInfo referenceSpaceCreateInfo = XrReferenceSpaceCreateInfo.mallocStack();
            referenceSpaceCreateInfo.set(
                XR10.XR_TYPE_REFERENCE_SPACE_CREATE_INFO,
                NULL,
                XR10.XR_REFERENCE_SPACE_TYPE_STAGE,
                identityPose
            );
            PointerBuffer pp = stack.mallocPointer(1);
            XR10.xrCreateReferenceSpace(xrSession, referenceSpaceCreateInfo, pp);
            xrAppSpace = new XrSpace(pp.get(0), xrSession);
        }
    }

    public void createXRSwapchains() {
        try (MemoryStack stack = stackPush()) {
//            ByteBuffer buf = stack.calloc(XrSystemProperties.SIZEOF);
//            buf.putInt(XR10.XR_TYPE_SYSTEM_PROPERTIES);
//            buf.rewind();
            XrSystemProperties systemProperties = XrSystemProperties.callocStack();
            XR10.xrGetSystemProperties(xrInstance, systemID, systemProperties);

            System.out.printf("Headset name:%s vendor:%d \n", memUTF8(systemProperties.systemName()), systemProperties.vendorId());
            XrSystemTrackingProperties trackingProperties = systemProperties.trackingProperties();
            System.out.printf("Headset orientationTracking:%b positionTracking:%b \n", trackingProperties.orientationTracking(), trackingProperties.positionTracking());
            XrSystemGraphicsProperties graphicsProperties = systemProperties.graphicsProperties();
            System.out.printf("Headset MaxWidth:%d MaxHeight:%d MaxLayerCount:%d \n", graphicsProperties.maxSwapchainImageWidth(), graphicsProperties.maxSwapchainImageHeight(), graphicsProperties.maxLayerCount());

            IntBuffer intBuf = stack.mallocInt(1);
            XR10.xrEnumerateViewConfigurationViews(xrInstance, systemID, viewConfigType, intBuf, null);
            viewConfigs = new XrViewConfigurationView.Buffer(
                mallocAndFillBufferUnsafe(intBuf.get(0), XrViewConfigurationView.SIZEOF, XR10.XR_TYPE_VIEW_CONFIGURATION_VIEW)
            );
            XR10.xrEnumerateViewConfigurationViews(xrInstance, systemID, viewConfigType, intBuf, viewConfigs);
            int viewCountNumber = intBuf.get(0);

            views = new XrView.Buffer(
                mallocAndFillBufferUnsafe(viewCountNumber, XrView.SIZEOF, XR10.XR_TYPE_VIEW)
            );

            assert (viewCountNumber == 2);  //For now this demo is only meant for stereo headsets

            if (viewCountNumber > 0) {
                XR10.xrEnumerateSwapchainFormats(xrSession, intBuf, null);
                LongBuffer swapchainFormats = stack.mallocLong(intBuf.get(0));
                XR10.xrEnumerateSwapchainFormats(xrSession, intBuf, swapchainFormats);

                long[] desiredSwapchainFormats = {
                    GL11.GL_RGB10_A2,
                    GL30.GL_RGBA16F,
                    // The two below should only be used as a fallback, as they are linear color formats without enough bits for color
                    // depth, thus leading to banding.
                    GL11.GL_RGBA8,
                    GL31.GL_RGBA8_SNORM
                };
                for (long glFormatIter : desiredSwapchainFormats) {
                    swapchainFormats.rewind();
                    while (swapchainFormats.hasRemaining()) {
                        if (glFormatIter == swapchainFormats.get()) {
                            glColorFormat = glFormatIter;
                            break;
                        }
                    }
                    if (glColorFormat != 0) {
                        break;
                    }
                }
                if (glColorFormat == 0) {
                    throw new IllegalStateException("No compatable swapchain / framebuffer format availible");
                }

                swapchains = new Swapchain[viewCountNumber];
                for (int i = 0; i < viewCountNumber; i++) {
                    XrViewConfigurationView viewConfig          = viewConfigs.get(i);
                    XrSwapchainCreateInfo   swapchainCreateInfo = XrSwapchainCreateInfo.mallocStack();
                    Swapchain               swapchainWrapper    = new Swapchain();

                    swapchainCreateInfo.set(
                        XR10.XR_TYPE_SWAPCHAIN_CREATE_INFO,
                        NULL,
                        0,
                        XR10.XR_SWAPCHAIN_USAGE_SAMPLED_BIT | XR10.XR_SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT,
                        glColorFormat,
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
                    int                              imageCount           = intBuf.get(0);
                    XrSwapchainImageOpenGLKHR.Buffer swapchainImageBuffer = XrSwapchainImageOpenGLKHR.create(imageCount);
                    for (XrSwapchainImageOpenGLKHR image : swapchainImageBuffer) {
                        image.type(KHROpenglEnable.XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR);
                    }

                    XR10.xrEnumerateSwapchainImages(swapchainWrapper.handle, intBuf, XrSwapchainImageBaseHeader.create(swapchainImageBuffer.address(), swapchainImageBuffer.capacity()));
                    swapchainWrapper.images = swapchainImageBuffer;
                    swapchains[i] = swapchainWrapper;
                }
            }
        }
    }

    private void createOpenGLResourses() {
        swapchainFramebuffer = GL30.glGenFramebuffers();
        depthTextures = new HashMap<>(0);
        for (Swapchain swapchain : swapchains) {
            for (XrSwapchainImageOpenGLKHR swapchainImage : swapchain.images) {
                int texture = glGenTextures();
                glBindTexture(GL_TEXTURE_2D, texture);
                glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
                glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
                glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
                glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
                glTexImage2D(GL_TEXTURE_2D, 0, GL_DEPTH_COMPONENT32, swapchain.width, swapchain.height, 0, GL_DEPTH_COMPONENT, GL_FLOAT, (ByteBuffer)null);
                depthTextures.put(swapchainImage, texture);
            }
        }
        glBindTexture(GL_TEXTURE_2D, 0);

        textureShader = Shaders.createShaderProgram(Shaders.texVertShader, Shaders.texFragShader);
        colorShader = Shaders.createShaderProgram(Shaders.colVertShader, Shaders.colFragShader);
        screenShader = Shaders.createShaderProgram(Shaders.screenVertShader, Shaders.texFragShader);

        {
            cubeVertexBuffer = glGenBuffers();
            glBindBuffer(GL_ARRAY_BUFFER, cubeVertexBuffer);
            glBufferData(GL_ARRAY_BUFFER, Geometry.cubeVertices, GL_STATIC_DRAW);

            cubeIndexBuffer = glGenBuffers();
            glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, cubeIndexBuffer);
            glBufferData(GL_ELEMENT_ARRAY_BUFFER, Geometry.cubeIndices, GL_STATIC_DRAW);

            cubeVAO = glGenVertexArrays();
            glBindVertexArray(cubeVAO);
            glEnableVertexAttribArray(0);
            glEnableVertexAttribArray(1);
            glVertexAttribPointer(0, 3, GL_FLOAT, false, 4 * 3 * 2, 0);
            glVertexAttribPointer(1, 3, GL_FLOAT, false, 24, 12);
        }
        {
            quadVAO = glGenVertexArrays();
            quadVertexBuffer = glGenBuffers();
            glBindVertexArray(quadVAO);
            glBindBuffer(GL_ARRAY_BUFFER, quadVertexBuffer);
            glBufferData(GL_ARRAY_BUFFER, Geometry.quadVertices, GL_STATIC_DRAW);
            glEnableVertexAttribArray(0);
            glVertexAttribPointer(0, 2, GL_FLOAT, false, 4 * 4, 0);
            glEnableVertexAttribArray(1);
            glVertexAttribPointer(1, 2, GL_FLOAT, false, 4 * 4, 2 * 4);
        }

        glBindBuffer(GL_ARRAY_BUFFER, 0);
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, 0);
        glBindVertexArray(0);
    }

    private boolean pollEvents() {
        glfwPollEvents();
        XrEventDataBaseHeader event = readNextOpenXREvent();
        if (event == null) {
            return false;
        }

        do {
            switch (event.type()) {
                case XR10.XR_TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING: {
                    XrEventDataInstanceLossPending instanceLossPending = XrEventDataInstanceLossPending.create(event.address());
                    System.err.printf("XrEventDataInstanceLossPending by %d\n", instanceLossPending.lossTime());
//            *requestRestart = true;
                    return true;
                }
                case XR10.XR_TYPE_EVENT_DATA_SESSION_STATE_CHANGED: {
                    XrEventDataSessionStateChanged sessionStateChangedEvent = XrEventDataSessionStateChanged.create(event.address());
                    return OpenXRHandleSessionStateChangedEvent(sessionStateChangedEvent/*, requestRestart*/);
                }
                case XR10.XR_TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED:
                    break;
                case XR10.XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING:
                default: {
                    System.out.printf("Ignoring event type %d\n", event.type());
                    break;
                }
            }
            event = readNextOpenXREvent();
        }
        while (event != null);

        return false;
    }

    private XrEventDataBaseHeader readNextOpenXREvent() {
        // It is sufficient to just clear the XrEventDataBuffer header to
        // XR_TYPE_EVENT_DATA_BUFFER rather than recreate it every time

        eventDataBuffer.clear();
        eventDataBuffer.type(XR10.XR_TYPE_EVENT_DATA_BUFFER);
        int result = XR10.xrPollEvent(xrInstance, eventDataBuffer);
        if (result == XR10.XR_SUCCESS) {
            if (eventDataBuffer.type() == XR10.XR_TYPE_EVENT_DATA_EVENTS_LOST) {
                XrEventDataEventsLost dataEventsLost = XrEventDataEventsLost.create(eventDataBuffer.address());
                System.out.printf("%d events lost\n", dataEventsLost.lostEventCount());
            }

            return XrEventDataBaseHeader.create(eventDataBuffer.address());
        }
        if (result == XR10.XR_EVENT_UNAVAILABLE) {
            return null;
        }
        throw new IllegalStateException(String.format("[XrResult failure %d in xrPollEvent]", result));
    }

    boolean OpenXRHandleSessionStateChangedEvent(XrEventDataSessionStateChanged stateChangedEvent) {
        int oldState = sessionState;
        sessionState = stateChangedEvent.state();

        System.out.printf("XrEventDataSessionStateChanged: state %s->%s session=%d time=%d\n", oldState, sessionState, stateChangedEvent.session(), stateChangedEvent.time());

        if ((stateChangedEvent.session() != NULL) && (stateChangedEvent.session() != xrSession.address())) {
            System.err.println("XrEventDataSessionStateChanged for unknown session");
            return false;
        }

        switch (sessionState) {
            case XR10.XR_SESSION_STATE_READY: {
                assert (xrSession != null);
                XrSessionBeginInfo sessionBeginInfo = XrSessionBeginInfo.mallocStack();
                sessionBeginInfo.set(XR10.XR_TYPE_SESSION_BEGIN_INFO, 0, viewConfigType);
                XR10.xrBeginSession(xrSession, sessionBeginInfo);
                sessionRunning = true;
                return false;
            }
            case XR10.XR_SESSION_STATE_STOPPING: {
                assert (xrSession != null);
                sessionRunning = false;
                XR10.xrEndSession(xrSession);
                return false;
            }
            case XR10.XR_SESSION_STATE_EXITING: {
                // Do not attempt to restart because user closed this session.
//        *requestRestart = false;
                return true;
            }
            case XR10.XR_SESSION_STATE_LOSS_PENDING: {
                // Poll for a new instance.
//        *requestRestart = true;
                return true;
            }
            default:
                return false;
        }
    }


    private void renderFrameOpenXR() {
        try (MemoryStack stack = stackPush()) {
            XrFrameWaitInfo frameWaitInfo = XrFrameWaitInfo.callocStack();
            frameWaitInfo.type(XR10.XR_TYPE_FRAME_WAIT_INFO);
            XrFrameState frameState = XrFrameState.callocStack();
            frameState.type(XR10.XR_TYPE_FRAME_STATE);
            XR10.xrWaitFrame(xrSession, frameWaitInfo, frameState);

            XrFrameBeginInfo frameBeginInfo = XrFrameBeginInfo.callocStack();
            frameBeginInfo.type(XR10.XR_TYPE_FRAME_BEGIN_INFO);
            XR10.xrBeginFrame(xrSession, frameBeginInfo);

            XrCompositionLayerProjection layerProjection = XrCompositionLayerProjection.callocStack();
            layerProjection.type(XR10.XR_TYPE_COMPOSITION_LAYER_PROJECTION);
            PointerBuffer layers = stack.callocPointer(1);

            if (frameState.shouldRender()) {
                if (renderLayerOpenXR(frameState.predictedDisplayTime(), layerProjection)) {
                    layers.put(layerProjection.address());
                }
            }
            layers.flip();

            XrFrameEndInfo frameEndInfo = XrFrameEndInfo.mallocStack();
            frameEndInfo.set(
                XR10.XR_TYPE_FRAME_END_INFO,
                0,
                frameState.predictedDisplayTime(),
                XR10.XR_ENVIRONMENT_BLEND_MODE_OPAQUE,
                layers.limit(),
                layers
            );

            if (layers.limit() > 0) {
                layerProjection.views().free(); //These values were allocated in a child function so they must be freed manually as we could not use the stack
            }

            XR10.xrEndFrame(xrSession, frameEndInfo);
        }
    }

    private boolean renderLayerOpenXR(long predictedDisplayTime, XrCompositionLayerProjection layer) {
        try (MemoryStack stack = stackPush()) {
            XrCompositionLayerProjectionView.Buffer projectionLayerViews;

            XrViewState viewState = new XrViewState(stack.calloc(XrViewState.SIZEOF));
            viewState.type(XR10.XR_TYPE_VIEW_STATE);
            IntBuffer intBuf = stack.mallocInt(1);

            XrViewLocateInfo viewLocateInfo = new XrViewLocateInfo(stack.malloc(XrViewLocateInfo.SIZEOF));
            viewLocateInfo.set(XR10.XR_TYPE_VIEW_LOCATE_INFO,
                0,
                viewConfigType,
                predictedDisplayTime,
                xrAppSpace
            );

            XR10.xrLocateViews(xrSession, viewLocateInfo, viewState, intBuf, views);

            if ((viewState.viewStateFlags() & XR10.XR_VIEW_STATE_POSITION_VALID_BIT) == 0 ||
                (viewState.viewStateFlags() & XR10.XR_VIEW_STATE_ORIENTATION_VALID_BIT) == 0) {
                return false;  // There is no valid tracking poses for the views.
            }
            int viewCountOutput = intBuf.get(0);
            assert (viewCountOutput == views.capacity());
            assert (viewCountOutput == viewConfigs.capacity());
            assert (viewCountOutput == swapchains.length);

            projectionLayerViews = new XrCompositionLayerProjectionView.Buffer(mallocAndFillBufferUnsafe(viewCountOutput, XrCompositionLayerProjectionView.SIZEOF, XR10.XR_TYPE_COMPOSITION_LAYER_PROJECTION_VIEW));

            // Render view to the appropriate part of the swapchain image.
            for (int viewIndex = 0; viewIndex < viewCountOutput; viewIndex++) {
                // Each view has a separate swapchain which is acquired, rendered to, and released.
                Swapchain viewSwapchain = swapchains[viewIndex];

                XrSwapchainImageAcquireInfo acquireInfo = new XrSwapchainImageAcquireInfo(stack.calloc(XrSwapchainImageAcquireInfo.SIZEOF));
                acquireInfo.type(XR10.XR_TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO);

                XR10.xrAcquireSwapchainImage(viewSwapchain.handle, acquireInfo, intBuf);
                int swapchainImageIndex = intBuf.get(0);

                XrSwapchainImageWaitInfo waitInfo = new XrSwapchainImageWaitInfo(stack.malloc(XrSwapchainImageWaitInfo.SIZEOF));
                waitInfo.set(XR10.XR_TYPE_SWAPCHAIN_IMAGE_WAIT_INFO, 0, XR10.XR_INFINITE_DURATION);

                XR10.xrWaitSwapchainImage(viewSwapchain.handle, waitInfo);

                XrCompositionLayerProjectionView projectionLayerView = projectionLayerViews.get(viewIndex);
                projectionLayerView.pose(views.get(viewIndex).pose());
                projectionLayerView.fov(views.get(viewIndex).fov());
                projectionLayerView.subImage().swapchain(viewSwapchain.handle);
                projectionLayerView.subImage().imageRect().offset().set(0, 0);
                projectionLayerView.subImage().imageRect().extent().set(viewSwapchain.width, viewSwapchain.height);

                OpenGLRenderView(projectionLayerView, viewSwapchain.images.get(swapchainImageIndex), viewIndex);

                XrSwapchainImageReleaseInfo releaseInfo = new XrSwapchainImageReleaseInfo(stack.calloc(XrSwapchainImageReleaseInfo.SIZEOF));
                releaseInfo.type(XR10.XR_TYPE_SWAPCHAIN_IMAGE_RELEASE_INFO);
                XR10.xrReleaseSwapchainImage(viewSwapchain.handle, releaseInfo);
            }

            layer.space(xrAppSpace);
            layer.views(projectionLayerViews);
            return true;
        }
    }
    private static Matrix4f    modelviewMatrix  = new Matrix4f();
    private static Matrix4f    projectionMatrix = new Matrix4f();
    private static Matrix4f    viewMatrix       = new Matrix4f();
    private static FloatBuffer mvpMatrix        = BufferUtils.createFloatBuffer(16);
    private void OpenGLRenderView(XrCompositionLayerProjectionView layerView, XrSwapchainImageOpenGLKHR swapchainImage, int viewIndex) {
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, swapchainFramebuffer);

        glFramebufferTexture2D(GL_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, GL_TEXTURE_2D, swapchainImage.image(), 0);
        glFramebufferTexture2D(GL_FRAMEBUFFER, GL_DEPTH_ATTACHMENT, GL_TEXTURE_2D, depthTextures.get(swapchainImage), 0);

        glViewport(
            layerView.subImage().imageRect().offset().x(),
            layerView.subImage().imageRect().offset().y(),
            layerView.subImage().imageRect().extent().width(),
            layerView.subImage().imageRect().extent().height()
        );

        float[] DarkSlateGray = {0.184313729f, 0.309803933f, 0.309803933f};
        glClearColor(DarkSlateGray[0], DarkSlateGray[1], DarkSlateGray[2], 1.0f);
        glClearDepth(1.0f);
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);

        glFrontFace(GL_CW);
        glCullFace(GL_BACK);
        glEnable(GL_DEPTH_TEST);

        XrPosef       pose        = layerView.pose();
        XrVector3f    pos         = pose.position$();
        XrQuaternionf orientation = pose.orientation();
        createProjectionFov(projectionMatrix, layerView.fov(), 0.1f, 100f);
        viewMatrix.translationRotateScaleInvert(pos.x(), pos.y(), pos.z(), orientation.x(), orientation.y(), orientation.z(), orientation.w(), 1, 1, 1);

        glDisable(GL_CULL_FACE);    // Disable back-face culling so we can see the inside of the world-space cube and backside of the plane

        {   // Rotating plane
            modelviewMatrix.translation(0, 0, -3).rotate((float)-glfwGetTime(), 1, 0, 0);
            glUseProgram(colorShader);
            glUniformMatrix4fv(glGetUniformLocation(colorShader, "projection"), false, projectionMatrix.get(mvpMatrix));
            glUniformMatrix4fv(glGetUniformLocation(colorShader, "view"), false, viewMatrix.get(mvpMatrix));
            glUniformMatrix4fv(glGetUniformLocation(colorShader, "model"), false, modelviewMatrix.get(mvpMatrix));
            glBindVertexArray(quadVAO);
            glDrawArrays(GL_TRIANGLES, 0, 6);
        }

        {   // World-space cube
            modelviewMatrix.identity().scale(10);
            glUniformMatrix4fv(glGetUniformLocation(colorShader, "model"), false, modelviewMatrix.get(mvpMatrix));
            glBindVertexArray(cubeVAO);
            glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, cubeIndexBuffer);
            glDrawElements(GL_TRIANGLES, 36, GL_UNSIGNED_SHORT, 0);
        }

        glEnable(GL_CULL_FACE);

        glBindFramebuffer(GL_FRAMEBUFFER, 0);

        if (viewIndex == 0) { //Copy the left eye's view to the glfw window, no color correction is applied so this image may look wrong
            glFrontFace(GL_CCW);
            glUseProgram(screenShader);
            glBindVertexArray(quadVAO);
            glDisable(GL_DEPTH_TEST);
            glBindTexture(GL_TEXTURE_2D, swapchainImage.image());
            glDrawArrays(GL_TRIANGLES, 0, 6);
            glfwSwapBuffers(window);
        }
    }

    private static Matrix4f createProjectionFov(Matrix4f dest, XrFovf fov, float nearZ, float farZ) {
        try (MemoryStack stack = stackPush()) {
            float tanLeft        = Math.tan(fov.angleLeft());
            float tanRight       = Math.tan(fov.angleRight());
            float tanDown        = Math.tan(fov.angleDown());
            float tanUp          = Math.tan(fov.angleUp());
            float tanAngleWidth  = tanRight - tanLeft;
            float tanAngleHeight = tanUp - tanDown;

            FloatBuffer m = stack.mallocFloat(16);
            m.put(0, 2.0f / tanAngleWidth);
            m.put(4, 0.0f);
            m.put(8, (tanRight + tanLeft) / tanAngleWidth);
            m.put(12, 0.0f);

            m.put(1, 0.0f);
            m.put(5, 2.0f / tanAngleHeight);
            m.put(9, (tanUp + tanDown) / tanAngleHeight);
            m.put(13, 0.0f);

            m.put(2, 0.0f);
            m.put(6, 0.0f);
            m.put(10, -(farZ + nearZ) / (farZ - nearZ));
            m.put(14, -(farZ * (nearZ + nearZ)) / (farZ - nearZ));

            m.put(3, 0.0f);
            m.put(7, 0.0f);
            m.put(11, -1.0f);
            m.put(15, 0.0f);
            return dest.set(m);
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

        static float[] quadVertices = { // vertex attributes for a quad that fills the entire screen in Normalized Device Coordinates.
            // positions   // texCoords
            -1.0f, 1.0f, 0.0f, 1.0f,
            -1.0f, -1.0f, 0.0f, 0.0f,
            1.0f, -1.0f, 1.0f, 0.0f,

            -1.0f, 1.0f, 0.0f, 1.0f,
            1.0f, -1.0f, 1.0f, 0.0f,
            1.0f, 1.0f, 1.0f, 1.0f
        };
    }
}