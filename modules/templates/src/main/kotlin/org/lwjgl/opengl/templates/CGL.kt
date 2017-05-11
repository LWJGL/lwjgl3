/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.macosx.*

val CGL = "CGL".nativeClass(
    OPENGL_PACKAGE,
    prefix = "CGL",
    prefixConstant = "kCGL",
    prefixMethod = "CGL",
    binding = GLBinding.delegate("GL.getFunctionProvider()")
) {
    documentation = "Native bindings to CGL."

    // -----------------------------------------------
    // CGLTypes.h

    val PixelFormatAttribs = IntConstant(
        "Attribute names for #ChoosePixelFormat() and #DescribePixelFormat().",

        "PFAAllRenderers".."1",
        "PFATripleBuffer".."3",
        "PFADoubleBuffer".."5",
        "PFAStereo".."6",
        "PFAColorSize".."8",
        "PFAAlphaSize".."11",
        "PFADepthSize".."12",
        "PFAStencilSize".."13",
        "PFAMinimumPolicy".."51",
        "PFAMaximumPolicy".."52",
        "PFASampleBuffers".."55",
        "PFASamples".."56",
        "PFAColorFloat".."58",
        "PFAMultisample".."59",
        "PFASupersample".."60",
        "PFASampleAlpha".."61",
        "PFARendererID".."70",
        "PFASingleRenderer".."71",
        "PFANoRecovery".."72",
        "PFAAccelerated".."73",
        "PFAClosestPolicy".."74",
        "PFABackingStore".."76",
        "PFABackingVolatile".."77",
        "PFADisplayMask".."84",
        "PFAAllowOfflineRenderers".."96",
        "PFAAcceleratedCompute".."97",
        "PFAOpenGLProfile".."99",
        "PFASupportsAutomaticGraphicsSwitching".."101",
        "PFAVirtualScreenCount".."128",
        "PFAAuxBuffers".."7",
        "PFAAccumSize".."14",
        "PFAOffScreen".."53",
        "PFAAuxDepthStencil".."57",
        "PFAWindow".."80",
        "PFACompliant".."83",
        "PFAPBuffer".."90",
        "PFARemotePBuffer".."91",
        "PFARobust".."75",
        "PFAMPSafe".."78",
        "PFAMultiScreen".."81",
        "PFAFullScreen".."54"
    ).javaDocLinks

    val RendererProperties = IntConstant(
        "Property names for #DescribeRenderer().",

        "RPOffScreen".."53",
        "RPRendererID".."70",
        "RPAccelerated".."73",
        "RPBackingStore".."76",
        "RPWindow".."80",
        "RPCompliant".."83",
        "RPDisplayMask".."84",
        "RPBufferModes".."100",
        "RPColorModes".."103",
        "RPAccumModes".."104",
        "RPDepthModes".."105",
        "RPStencilModes".."106",
        "RPMaxAuxBuffers".."107",
        "RPMaxSampleBuffers".."108",
        "RPMaxSamples".."109",
        "RPSampleModes".."110",
        "RPSampleAlpha".."111",
        "RPVideoMemory".."120",
        "RPTextureMemory".."121",
        "RPGPUVertProcCapable".."122",
        "RPGPUFragProcCapable".."123",
        "RPRendererCount".."128",
        "RPOnline".."129",
        "RPAcceleratedCompute".."130",
        "RPVideoMemoryMegabytes".."131",
        "RPTextureMemoryMegabytes".."132",
        "RPRobust".."75",
        "RPMPSafe".."78",
        "RPMultiScreen".."81",
        "RPFullScreen".."54"
    ).javaDocLinks

    val ContextOptions = IntConstant(
        "Enable names for #Enable(), #Disable(), and #IsEnabled().",

        "CESwapRectangle".."201",
        "CESwapLimit".."203",
        "CERasterization".."221",
        "CEStateValidation".."301",
        "CESurfaceBackingSize".."305",
        "CEDisplayListOptimization".."307",
        "CEMPEngine".."313"
    ).javaDocLinks

    val ContextParameters = IntConstant(
        "Parameter names for #SetParameter() and #GetParameter().",

        "CPSwapRectangle".."200",
        "CPSwapInterval".."222",
        "CPDispatchTableSize".."224",
        "CPClientStorage".."226",
        "CPSurfaceTexture".."228",
        "CPSurfaceOrder".."235",
        "CPSurfaceOpacity".."236",
        "CPSurfaceBackingSize".."304",
        "CPSurfaceSurfaceVolatile".."306",
        "CPReclaimResources".."308",
        "CPCurrentRendererID".."309",
        "CPGPUVertexProcessing".."310",
        "CPGPUFragmentProcessing".."311",
        "CPHasDrawable".."314",
        "CPMPSwapsInFlight".."315"
    ).javaDocLinks

    val GlobalOptions = IntConstant(
        "Option names for #SetGlobalOption() and #GetGlobalOption().",

        "GOFormatCacheSize".."501",
        "GOClearFormatCache".."502",
        "GORetainRenderers".."503",
        "GOResetLibrary".."504",
        "GOUseErrorHandler".."505",
        "GOUseBuildCache".."506"
    ).javaDocLinks

    IntConstant(
        "OpenGL Implementation Profiles.",

        "OGLPVersion_Legacy"..0x1000,
        "OGLPVersion_3_2_Core"..0x3200
    )

    val Errors = IntConstant(
        "CGL error return values.",

        "NoError".."0",
        "BadAttribute".."10000",
        "BadProperty".."10001",
        "BadPixelFormat".."10002",
        "BadRendererInfo".."10003",
        "BadContext".."10004",
        "BadDrawable".."10005",
        "BadDisplay".."10006",
        "BadState".."10007",
        "BadValue".."10008",
        "BadMatch".."10009",
        "BadEnumeration".."10010",
        "BadOffScreen".."10011",
        "BadFullScreen".."10012",
        "BadWindow".."10013",
        "BadAddress".."10014",
        "BadCodeModule".."10015",
        "BadAlloc".."10016",
        "BadConnection".."10017"
    ).javaDocLinks

    IntConstant(
        "Buffer modes.",

        "MonoscopicBit"..0x00000001,
        "StereoscopicBit"..0x00000002,
        "SingleBufferBit"..0x00000004,
        "DoubleBufferBit"..0x00000008,
        "TripleBufferBit"..0x00000010
    )

    IntConstant(
        "Depth and stencil buffer depths.",

        "0Bit"..0x00000001,
        "1Bit"..0x00000002,
        "2Bit"..0x00000004,
        "3Bit"..0x00000008,
        "4Bit"..0x00000010,
        "5Bit"..0x00000020,
        "6Bit"..0x00000040,
        "8Bit"..0x00000080,
        "10Bit"..0x00000100,
        "12Bit"..0x00000200,
        "16Bit"..0x00000400,
        "24Bit"..0x00000800,
        "32Bit"..0x00001000,
        "48Bit"..0x00002000,
        "64Bit"..0x00004000,
        "96Bit"..0x00008000,
        "128Bit"..0x00010000
    )

    IntConstant(
        "Color and accumulation buffer formats.",

        "RGB444Bit"..0x00000040,
        "ARGB4444Bit"..0x00000080,
        "RGB444A8Bit"..0x00000100,
        "RGB555Bit"..0x00000200,
        "ARGB1555Bit"..0x00000400,
        "RGB555A8Bit"..0x00000800,
        "RGB565Bit"..0x00001000,
        "RGB565A8Bit"..0x00002000,
        "RGB888Bit"..0x00004000,
        "ARGB8888Bit"..0x00008000,
        "RGB888A8Bit"..0x00010000,
        "RGB101010Bit"..0x00020000,
        "ARGB2101010Bit"..0x00040000,
        "RGB101010_A8Bit"..0x00080000,
        "RGB121212Bit"..0x00100000,
        "ARGB12121212Bit"..0x00200000,
        "RGB161616Bit"..0x00400000,
        "RGBA16161616Bit"..0x00800000,
        "RGBFloat64Bit"..0x01000000,
        "RGBAFloat64Bit"..0x02000000,
        "RGBFloat128Bit"..0x04000000,
        "RGBAFloat128Bit"..0x08000000,
        "RGBFloat256Bit"..0x10000000,
        "RGBAFloat256Bit"..0x20000000
    )

    IntConstant(
        "Sampling modes.",

        "SupersampleBit"..0x00000001,
        "MultisampleBit"..0x00000002
    )

    // -----------------------------------------------
    // CGLCurrent.h

    CGLContextObj(
        "GetCurrentContext",
        "Returns the current rendering context. If there is none, returns #NULL."
    )

    CGLError(
        "SetCurrentContext",
        """
        Sets the specified rendering context as the current rendering context.

        There can be only one current rendering context. Subsequent OpenGL rendering calls operate on the current rendering context to modify the drawable
        object associated with it.

        You can use AGL macros to bypass the current rendering context mechanism and maintain your own current rendering context.

        A context is current on a per-thread basis. Multiple threads must serialize calls into the same context.
        """,

        CGLContextObj.IN(
            "context",
            "the rendering context to set as the current rendering context. Pass #NULL to release the current rendering context without assigning a new one."
        )
    )

    // -----------------------------------------------
    // CGLDevice.h

    CGLShareGroupObj(
        "GetShareGroup",
        "Returns the sharegroup of the specified rendering context.",

        CGLContextObj.IN("ctx", "a rendering context")
    )

    // -----------------------------------------------
    // OpenGL.h

    // Pixel format functions

    CGLError(
        "ChoosePixelFormat",
        "Creates a pixel format object that satisfies the constraints of the specified buffer and renderer attributes.",

        NullTerminated..const..CGLPixelFormatAttribute_p.IN(
            "attribs",
            """
            a 0 terminated array that contains a list of buffer and renderer attributes. Attributes can be Boolean or integer. If an attribute is integer, you
            must supply the desired value immediately following the attribute. If the attribute is Boolean, do not supply a value because its presence in the
            attributes array implies a true value.
            """,
            PixelFormatAttribs
        ),
        nullable..Check(1)..CGLPixelFormatObj_p.OUT(
            "pix",
            """
            the memory address of a pixel format object. On return, points to a new pixel format object that contains pixel format information and a list of
            virtual screens. If there are no pixel formats or virtual screens that satisfy the constraints of the buffer and renderer attributes, the value of
            pix is set to #NULL.
            """
        ),
        Check(1)..GLint_p.OUT(
            "npix",
            "on return, points to the number of virtual screens referenced by pix. If pix is #NULL, the value of {@code npix} is set to 0."
        )
    )

    CGLError(
        "DestroyPixelFormat",
        "Frees the memory associated with a pixel format object. Calling this function is equivalent to calling #ReleasePixelFormat().",

        CGLPixelFormatObj.IN("pix", "the pixel format object to destroy")
    )

    CGLError(
        "DescribePixelFormat",
        "Retrieves the values of an attribute associated with a pixel format object.",

        CGLPixelFormatObj.IN("pix", "the pixel format object to query"),
        GLint.IN(
            "pix_num",
            "the virtual screen number whose attribute value you want to retrieve. This value must be between 0 and the number of virtual screens minus one."
        ),
        CGLPixelFormatAttribute.IN("attrib", "the attribute whose value you want to obtain", PixelFormatAttribs),
        Check(1)..GLint_p.OUT("value", "on return, points to the value of the attribute")
    )

    void(
        "ReleasePixelFormat",
        """
        Decrements the reference count of a pixel format object.

        The system retains the pixel format object when you call the function #CreateContext(), so you can release a pixel format object immediately
        after passing it to the context creation function.

        Each call to CGLReleasePixelFormat decreases the reference count by 1. If the reference count reaches 0, the pixel format object is destroyed.
        """,

        CGLPixelFormatObj.IN("pix", "the pixel format object whose reference count should be decremented")
    )

    CGLPixelFormatObj(
        "RetainPixelFormat",
        """
        Increments the receiver's reference count.

        Each call to CGLRetainPixelFormat increases the reference count by 1. Each call to CGLRetainPixelFormat must be matched with a call to
        #ReleasePixelFormat().
        """,

        CGLPixelFormatObj.IN("pix", "the pixel format object whose reference count should be incremented")
    )

    GLuint(
        "GetPixelFormatRetainCount",
        "Returns the retain count of a pixel format object.",

        CGLPixelFormatObj.IN("pix", "a pixel format object")
    )

    // Renderer information functions

    CGLError(
        "QueryRendererInfo",
        """
        Creates a renderer information object that contains properties and values for renderers able to drive all the specified displays in a given display
        mask.
        """,

        GLuint.IN(
            "display_mask",
            """
            a bit field that contains the bitwise OR of OpenGL display masks returned by the CGDisplayIDToOpenGLDisplayMask function. If you want to obtain
            information for all renderers in the system you must call CGLQueryRendererInfo once for each display bit.
            """
        ),
        Check(1)..CGLRendererInfoObj_p.OUT(
            "rend",
            """
            the memory address of a renderer information object. On return, points to a renderer information object that describes all renderers that are able
            to drive the displays specified by the {@code display_mask} parameter. If {@code display_mask} does not specify any displays, the value of
            {@code rend} is set to #NULL. You must call #DestroyRendererInfo() when you no longer need this object.
            """
        ),
        Check(1)..GLint_p.OUT(
            "nrend",
            """
            on return, points to the number of renderers described in the renderer information object. If {@code display_mask} does not specify any displays,
            the value of {@code nrend} is set to 0.
            """
        )
    )

    CGLError(
        "DestroyRendererInfo",
        "Frees resources associated with a renderer information object.",

        CGLRendererInfoObj.IN("rend", "the renderer information object to destroy")
    )

    CGLError(
        "DescribeRenderer",
        "Obtains the value associated with a renderer property.",

        CGLRendererInfoObj.IN(
            "rend",
            """
            an opaque renderer information object that contains a description of the renderer capabilities you want to inspect. You can obtain a renderer
            information object by calling the function #QueryRendererInfo(). You must call #DestroyRendererInfo() when you no longer need this
            object.
            """
        ),
        GLint.IN(
            "rend_num",
            """
            the index of the renderer inside the renderer information object — a value between 0 and the number of renderers minus one. The number of renderers
            can be obtained by calling #DescribeRenderer(), passing in {@code rend}, renderer number 0, and the renderer property
            #RPRendererCount.
            """
        ),
        CGLRendererProperty.IN("prop", "the renderer property whose value you want to obtain", RendererProperties),
        Check(1)..GLint_p.OUT("value", "on return, points to the value of the requested property")
    )

    // Context functions

    CGLError(
        "CreateContext",
        "Creates a CGL rendering context.",

        CGLPixelFormatObj.IN("pix", "a pixel format object created by calling the function #ChoosePixelFormat()"),
        CGLContextObj.IN(
            "share",
            """
            the rendering context with which to share the OpenGL object state — including texture objects, programs and shader display lists, vertex array
            objects, vertex buffer objects, pixel buffer objects, and frame buffer objects — and the object state associated which each of these object types.
            Pass #NULL to indicate that no sharing is to take place.
            """
        ),
        Check(1)..CGLContextObj_p.OUT(
            "ctx",
            """
            the memory address of a context object. On return, points to a new context object with the buffers and attributes specified by the {@code pix}
            parameter. If the context can not be created as specified, the value of {@code ctx} is set to #NULL.
            """
        )
    )

    CGLError(
        "DestroyContext",
        """
        Frees the resources associated with a rendering context.

        Starting in Mac OS 10.5, CGL rendering contexts are reference counted. For compatibility reasons, calling CGLDestroyContext clears the drawable
        associated with the rendering context. Calling CGLDestroyContext is the equivalent of calling both #ClearDrawable() and
        #ReleaseContext().
        """,

        CGLContextObj.IN("ctx", "the rendering context to destroy")
    )

    CGLError(
        "CopyContext",
        "Copies the specified state variables from one rendering context to another.",

        CGLContextObj.IN("src", "the source rendering context"),
        CGLContextObj.IN("dst", "the destination rendering context"),
        GLbitfield.IN(
            "mask",
            """
            a mask that specifies the state variables to copy. Pass a bit field that contains the bitwise OR of the state variable names that you want to copy.
            Use the symbolic mask constants that are passed to the OpenGL function #PushAttrib(). To copy as many state variables
            as possible, supply the constant #ALL_ATTRIB_BITS.
            """
        )
    )

    CGLContextObj(
        "RetainContext",
        """
        Increments the retain count on a CGL rendering context.

        Each call to CGLRetainContext increases the retain count by 1. To prevent memory leaks, each retain call must be balanced with a call to
        #ReleaseContext().
        """,

        CGLContextObj.IN("ctx", "the rendering context to be retained"),

        returnDoc = "the same context that was passed into the function."
    )

    void(
        "ReleaseContext",
        """
        Decrements the retain count on a CGL rendering context.

        Each call to CGLReleaseContext decreases the retain count by 1.

        When the retain count reaches 0, all resources associated with the rendering context are freed. If the rendering context that you pass is the current
        rendering context and it is freed, the current context is set to #NULL and there is no current rendering context after the function executes. After the
        context is freed, you must make sure you do not use the destroyed rendering context. This includes using CGL macros in which the rendering context is
        explicitly passed to OpenGL.
        """,

        CGLContextObj.IN("ctx", "the rendering context to be released")
    )

    GLuint(
        "GetContextRetainCount",
        "Returns the current retain count of a CGL rendering context.",

        CGLContextObj.IN("ctx", "the CGL rendering context whose retain count you wish to discover")
    )

    CGLPixelFormatObj(
        "GetPixelFormat",
        """
        Retrieves the current pixel format associated with a CGL rendering context.

        The pixel format object is not retained before being returned to your application. If your application needs to maintain this object, it should call
        #RetainPixelFormat().
        """,

        CGLContextObj.IN("ctx", "the CGL rendering context whose format you want to receive")
    )

    // PBuffer functions

    CGLError(
        "CreatePBuffer",
        """
        Creates a pixel buffer of the specified size, compatible with the specified texture target.

        This function does not have any knowledge of OpenGL contexts or pixel format objects and does not specifically allocate the storage needed for the
        actual pixel buffer. These operations occur when you call the function #SetPBuffer().

        You can determine the dimensional limits of a pixel buffer by calling the OpenGL function glGetInteger. You can find the maximum size supported by
        querying GL_MAX_VIEWPORT_DIMS and the minimum size by querying GL_MIN_PBUFFER_VIEWPORT_DIMS_APPLE, which returns two integer values (similar to
        GL_MAX_VIEWPORT_DIMS). All pixel buffer dimensions that you request with the function aglCreatePBuffer should fall within these limits (inclusively)
        and should comply with any limitations imposed by the texture target you select.

        The maximum viewport size supported in OS X is quite large. You should take into consideration the amount of video or system memory required to support
        the requested pixel buffer size, including additional memory needed for multiple buffers and options such as multisampling.

        Starting in OS X v10.5, pixel buffer objects are reference counted. Pixel buffer objects are created with a reference count of 1 and are destroyed when
        the last reference to the object is released.

        Deprecated in OS X v10.7.
        """,

        GLsizei.IN("width", "the width, in pixels, of the pixel buffer"),
        GLsizei.IN("height", "the height, in pixels, of the pixel buffer"),
        GLenum.IN(
            "target",
            "a constant that specifies the type of the pixel buffer target texture", "#TEXTURE_2D #TEXTURE_CUBE_MAP #TEXTURE_RECTANGLE"
        ),
        GLenum.IN(
            "internalFormat",
            """
            a constant that specifies the internal color format of the pixel buffer. The format controls whether the alpha channel of the pixel buffer is used
            for texturing operations.
            """,
            "#RGB GL11#GL_RGBA"
        ),
        GLint.IN(
            "max_level",
            """
            the maximum level of mipmap detail allowable. Pass 0 for a pixel buffer that is not using mipmaps. The value passed should never exceed the actual
            maximum number of mipmap levels that can be represented with the given width and height.
            """
        ),
        Check(1)..CGLPBufferObj_p.OUT("pbuffer", "on return, points to a new pixel buffer object")
    )

    CGLError(
        "DestroyPBuffer",
        """
        Releases the resources associated with a pixel buffer object.

        Starting in OS X v10.5, pixel buffer objects are reference counted. Calling this function is equivalent to calling #ReleasePBuffer().

        Deprecated in OS X v10.7.
        """,

        CGLPBufferObj.IN("pbuffer", "the pixel buffer object whose resources you want to release")
    )

    CGLError(
        "DescribePBuffer",
        """
        Retrieves information that describes the specified pixel buffer object.

        The width, height, texture target, and internal texture color format of a pixel buffer object are set at its creation and cannot be changed without
        destroying and recreating the object. The level is set when the pixel buffer object is attached to a rendering context by calling the function
        #SetPBuffer().

        Deprecated in OS X v10.7.
        """,

        CGLPBufferObj.IN("obj", "a pointer to the pixel buffer object"),
        Check(1)..GLsizei_p.OUT("width", "on return, points to the width, in pixels, of the pixel buffer"),
        Check(1)..GLsizei_p.OUT("height", "on return, points to the height, in pixels, of the pixel buffer"),
        Check(1)..GLenum_p.OUT("target", "on return, points to a constant that specifies the pixel buffer texture target"),
        Check(1)..GLenum_p.OUT("internalFormat", "on return, points to a constant that specifies the internal color format of the pixel buffer"),
        Check(1)..GLint_p.OUT("mipmap", "on return, points to the mipmap level of the pixel buffer or 0 if it doesn't use mipmaps")
    )

    CGLError(
        "TexImagePBuffer",
        """
        Binds the contents of a pixel buffer to a data source for a texture object.

        You must generate and bind a texture name (using standard OpenGL texturing calls) that is compatible with the pixel buffer texture target. Don't supply
        a texture object that was used previously for nonpixel buffer texturing operations unless you first call glDeleteTextures to regenerate the texture
        name.

        If you modify the content of a pixel buffer that uses mipmap levels, you must call this function again before drawing with the pixel buffer, to ensure
        that the content is synchronized with OpenGL. For pixel buffers without mipmaps, simply rebind to the texture object to synchronize content.

        No OpenGL texturing calls that modify a pixel buffer texture content are permitted (such as glTexSubImage2D or glCopyTexImage2D) with the pixel buffer
        texture as the destination. It is permitted to use texturing commands to read data from a pixel buffer texture, such as glCopyTexImage2D, with the
        pixel buffer texture as the source. It is also legal to use OpenGL functions such as glReadPixels to read the contents of a pixel buffer directly
        through the pixel buffer context.

        Note that texturing with the CGLTexImagePBuffer function can fail to produce the intended results without error in the same way other OpenGL texturing
        commands can normally fail. The function fails if you set an incompatible filter mode, do not enable the proper texture target, or other conditions
        described in the OpenGL specification.

        You don't need to share a context to use a pixel buffer object as a texture source. You can use independent pixel format objects and OpenGL contexts
        for both the pixel buffer and the target drawable object without sharing resources, and still texture using a pixel buffer in the target context.

        Deprecated in OS X v10.7.
        """,

        CGLContextObj.IN(
            "ctx",
            """
            a rendering context, which is the target context for the texture operation. This is the context that you plan to render content to. This is not the
            context attached to the pixel buffer.
            """
        ),
        CGLPBufferObj.IN("pbuffer", "a pixel buffer object"),
        GLenum.IN(
            "source",
            """
            the source buffer to get the texture from, which should be a valid OpenGL buffer such as GL_FRONT or GL_BACK and should be compatible with the
            buffer and renderer attributes that you used to create the rendering context attached to the pixel buffer. This means that the pixel buffer must
            possess the buffer in question for the texturing operation to succeed.
            """
        )
    )

    CGLPBufferObj(
        "RetainPBuffer",
        """
        Increments the retain count on a pixel buffer object.

        Each call to CGLRetainPBuffer increases the retain count by 1. To prevent the pixel buffer object from being leaked, each retain call must be matched
        with a call to #ReleasePBuffer().

        Deprecated in OS X v10.7.
        """,

        CGLPBufferObj.IN("pbuffer", "the pixel buffer object whose retain count you wish to increment")
    )

    void(
        "ReleasePBuffer",
        """
        Releases the resources associated with a pixel buffer object.

        Starting in OS X v10.5, pixel buffer objects are reference counted. Calling this function is equivalent to calling CGLReleasePBuffer.

        Deprecated in OS X v10.7.
        """,

        CGLPBufferObj.IN("pbuffer", "the pixel buffer object whose resources you want to release")
    )

    GLuint(
        "GetPBufferRetainCount",
        """
        Returns the retain count of a pixel buffer object.

        Deprecated in OS X v10.7.
        """,

        CGLPBufferObj.IN("pbuffer", "the pixel buffer object whose retain count you wish to retrieve")
    )

    // Drawable Functions

    CGLError(
        "SetOffScreen",
        """
        Attaches a rendering context to an offscreen buffer.

        Before calling this function, you must set up the rendering context using a pixel format object created with the kCGLPFAOffScreen attribute. For more
        information about kCGLPFAOffScreen, see Buffer and Renderer Attributes.

        After calling this function, subsequent OpenGL drawing is rendered into the offscreen buffer and the viewport of the rendering context is set to the
        full size of the offscreen area.

        To exit offscreen mode, call #ClearDrawable().

        To obtain functionality similar to offscreen mode on renderers that do not support it, attach the context to a hidden window and use the OpenGL
        function glReadPixels.

        Deprecated in OS X v10.7.
        """,

        CGLContextObj.IN("ctx", "a rendering context"),
        GLsizei.IN("width", "the width, in pixels, of the offscreen buffer"),
        GLsizei.IN("height", "the height, in pixels, of the offscreen buffer"),
        GLint.IN("rowbytes", "the number of bytes per row of the offscreen buffer, which must be greater than or equal to width times bytes per pixel"),
        Check("rowbytes * height")..void_p.IN(
            "baseaddr",
            "a pointer to a block of memory to use as the offscreen buffer. The size of the memory must be at least {@code rowbytes*height} bytes."
        )
    )

    CGLError(
        "GetOffScreen",
        """
        Retrieves an offscreen buffer and its parameters for a specified rendering context.

        Deprecated in OS X v10.7.
        """,

        CGLContextObj.IN("ctx", "a rendering context"),
        Check(1)..GLsizei_p.OUT(
            "width",
            """
            on return, points to the width, in pixels, of the offscreen buffer. If the rendering context is not attached to an offscreen drawable object, the
            value of width is set to 0.
            """
        ),
        Check(1)..GLsizei_p.OUT(
            "height",
            """
            on return, points to the height, in pixels, of the offscreen buffer. If the rendering context is not attached to an offscreen drawable object, the
            value of height is set to 0.
            """
        ),
        Check(1)..GLint_p.OUT(
            "rowbytes",
            """
            on return, points to the number of bytes per row of the offscreen buffer. If the context is not attached to an offscreen drawable object, the value
            of rowbytes is set to 0.
            """
        ),
        Check(1)..opaque_p.p.OUT(
            "baseaddr",
            """
            on return, points to the base address of the offscreen buffer. If the context is not attached to an offscreen drawable object, the value of
            {@code baseaddr} is set to #NULL.
            """
        )
    )

    CGLError(
        "SetFullScreen",
        """
        Attaches a rendering context to its full-screen drawable object.

        Before calling this function, you must set up the rendering context using a pixel format object created with the kCGLPFAFullScreen attribute (see
        Buffer and Renderer Attributes). Some OpenGL renderers, such as the software renderer, do not support full-screen mode. After you call the function
        #ChoosePixelFormat() with the full-screen attribute, you need to check whether the pixel format object is created successfully.

        You must capture the display prior to entering full-screen mode and release it after exiting. After calling this function, subsequent OpenGL drawing is
        rendered into the entire screen. For more information, see ${url(
            "https://developer.apple.com/library/mac/documentation/GraphicsImaging/Conceptual/OpenGL-MacProgGuide/opengl_intro/opengl_intro.html\\#//apple_ref/doc/uid/TP40001987",
            "OpenGL Programming Guide for Mac")
        }.

        To exit full-screen mode, call #ClearDrawable().

        Deprecated in OS X v10.7. Use #SetFullScreenOnDisplay() instead.
        """,

        CGLContextObj.IN("ctx", "a rendering context")
    )

    CGLError(
        "SetFullScreenOnDisplay",
        """
        Attaches a rendering context to a full-screen drawable object." +

        This function obtains a drawable object that covers an entire screen and attaches it to the rendering context. A full-screen rendering context may
        allow the underlying renderer to provide better performance compared to a context associated with a window that partially covers the screen.

        Prior to calling this function, your application should ensure that the context is capable of rendering to this display by querying the appropriate
        renderer properties. For more information, see #QueryRendererInfo(). Note that some renderers, including the software renderer, do not support
        full-screen mode.

        You must capture the screen prior to entering full-screen mode and release it after exiting. After calling this function, subsequent OpenGL drawing is
        rendered into the entire screen. For more information, see OpenGL Programming Guide for Mac.

        To exit full-screen mode, call #ClearDrawable().

        In OS X v10.6 or later, this function is not deprecated, but is usually not necessary. If your application creates a window that completely covers the
        screen, the system implicitly creates a full-screen instance, for the same potential performance benefit.

        Deprecated in OS X v10.7.
        """,

        CGLContextObj.IN("ctx", "a rendering context"),
        GLuint.IN("display_mask", "a bit field that contains the OpenGL display mask for the screen you wish the context to cover")
    )

    CGLError(
        "SetPBuffer",
        """
        Attaches a pixel buffer object to a rendering context.

        The first time you call this function for a specific pixel buffer object, the system creates the necessary buffers. The buffers are created to support
        the attributes dictated by the pixel format object used to create the rendering context and by the parameters used to create the pixel buffer object.
        The storage requirements for pixel buffer objects, which can be quite large, are very similar to the requirements for windows or views with OpenGL
        contexts attached. All drawable objects compete for the same scarce resources. This function can fail is there is not enough contiguous VRAM for each
        buffer. It's best to code defensively with a scheme that reduces resource consumption without causing the application to resort to failure. Unless, of
        course, failure is the only viable alternative.

        The ability to attach a pixel buffer to a context is supported only on renderers that export GL_APPLE_pixel_buffer in the GL_EXTENSIONS string. Before
        calling this function, you should programmatically determine if it’s possible to attach a pixel buffer to a context by querying GL_EXTENSIONS in the
        context and looking for GL_APPLE_pixel_buffer. If that extension is not present, the renderer won’t allow setting the pixel buffer.

        In order of performance, these are the renderers you should consider using when setting up a rendering context to attach to a pixel buffer:
        ${ul(
            "A hardware renderer.",
            "The generic render, but only with an offscreen pixel format and glTexSubImage.",
            "The Apple software renderer, which supports pixel buffers in OS X v10.4.8 and later."
        )}
        Deprecated in OS X v10.7.
        """,

        CGLContextObj.IN("ctx", "the rendering context to attach the pixel buffer to"),
        CGLPBufferObj.IN("pbuffer", "a pixel buffer object"),
        GLenum.IN("face", "the cube map face to draw if the pixel buffer texture target type is #TEXTURE_CUBE_MAP; otherwise pass 0."),
        GLint.IN(
            "level",
            """
            the mipmap level to draw. This must not exceed the maximum mipmap level set when the pixel buffer object was created. Pass 0 for a texture target
            that does not support mipmaps.
            """),
        GLint.IN(
            "screen",
            """
            a virtual screen value. The virtual screen determines the renderer OpenGL uses to draw to the pixel buffer object. For best performance, for a
            pixel buffer used as a texture source, you should supply the virtual screen value that results in using the same renderer used by the context
            that's the texturing target.
            """
        )
    )

    CGLError(
        "GetPBuffer",
        """
        Retrieves a pixel buffer and its parameters for a specified rendering context.

        Deprecated in OS X v10.7.
        """,

        CGLContextObj.IN("ctx", "a rendering context"),
        Check(1)..CGLPBufferObj_p.OUT("pbuffer", "on return, points to the pixel buffer object attached to the rendering context"),
        Check(1)..GLenum_p.OUT(
            "face",
            """
            on return, points to the cube map face that is set if the pixel buffer texture target type is #TEXTURE_CUBE_MAP; otherwise 0 for all other
            texture target types.
            """
        ),
        Check(1)..GLint_p.OUT("level", "on return, points to the current mipmap level for drawing"),
        Check(1)..GLint_p.OUT("screen", "on return, points to the current virtual screen number, as set by the last valid call to #SetPBuffer()")
    )

    CGLError(
        "ClearDrawable",
        "Disassociates a rendering context from any drawable objects attached to it.",

        CGLContextObj.IN("ctx", "a rendering context")
    )

    CGLError(
        "FlushDrawable",
        """
        Copies the back buffer of a double-buffered context to the front buffer.

        To create a double-buffered context, specify the #PFADoubleBuffer attribute when you create the pixel format object for the rendering
        context. If the backing store attribute is set to false, the buffers can be exchanged rather than copied. This is often the case in full-screen mode. If
        the receiver is not a double-buffered context, this call does nothing.

        If you set the swap interval attribute (#CPSwapInterval) appropriately, the copy takes place during the vertical retrace of the display,
        rather than immediately after CGLFlushDrawable is called. An implicit #Flush() operation is performed by CGLFlushDrawable
        before it returns. For optimal performance, an application should not call glFlush immediately before calling CGLFlushDrawable. Subsequent OpenGL
        commands can be issued immediately after calling CGLFlushDrawable, but are not executed until the buffer copy is completed.
        """,

        CGLContextObj.IN("ctx", "the context object")
    )

    // Per context enables and parameters

    CGLError(
        "Enable",
        "Enables an option for a rendering context.",

        CGLContextObj.IN("ctx", "a rendering context"),
        CGLContextEnable.IN("pname", "the option to enable", ContextOptions)
    )

    CGLError(
        "Disable",
        "Disables an option for a rendering context.",

        CGLContextObj.IN("ctx", "a rendering context"),
        CGLContextEnable.IN("pname", "the option to disable", ContextOptions)
    )

    CGLError(
        "IsEnabled",
        "Reports whether an option is enabled for a rendering context.",

        CGLContextObj.IN("ctx", "a rendering context"),
        CGLContextEnable.IN("pname", "the option to query", ContextOptions),
        Check(1)..GLint_p.OUT("enable", "on return, enable is set to true if the option is enabled")
    )

    CGLError(
        "SetParameter",
        "Sets the value of a rendering context parameter.",

        CGLContextObj.IN("ctx", "a rendering context"),
        CGLContextParameter.IN("pname", "the parameter whose value you want to set", ContextParameters),
        SingleValue("param")..Check(1)..const..GLint_p.IN("params", "a pointer to the value to set the parameter to")
    )

    CGLError(
        "GetParameter",
        "Retrieves the value of a rendering context parameter.",

        CGLContextObj.IN("ctx", "a rendering context"),
        CGLContextParameter.IN("pname", "the parameter whose value you want to retrieve", ContextParameters),
        Check(1)..GLint_p.OUT("params", "on return, points to the value of the parameter")
    )

    // Virtual screen functions

    CGLError(
        "SetVirtualScreen",
        """
        Forces subsequent OpenGL commands to the specified virtual screen.

        Setting the virtual screen forces the renderer associated with the virtual screen to process OpenGL commands issued to the specified context. Changing
        the virtual screen changes the current renderer. You should use this function only when it is necessary to override the default behavior. The current
        virtual screen is normally set automatically. Because the current virtual screen determines which OpenGL renderer is processing commands, the return
        values of all glGetXXX functions can be affected by the current virtual screen.
        """,

        CGLContextObj.IN("ctx", "a rendering context"),
        GLint.IN(
            "screen",
            """
            a virtual screen number, which must be a value between 0 and the number of virtual screens minus one. The number of virtual screens available in a
            context can be obtained by calling the function #DescribePixelFormat(), passing in the pixel format object used to create the rendering
            context, 0 for the virtual screen number ({@code pix_num} parameter), and the attribute constant #PFAVirtualScreenCount.
            """
        )
    )

    CGLError(
        "GetVirtualScreen",
        """
        Gets the current virtual screen number associated with a rendering context.

        The current virtual screen can change when a drawable object is moved or resized across graphics device boundaries. A change in the current virtual
        screen can affect the return values of some OpenGL functions and in most cases also means that the renderer has changed.
        """,

        CGLContextObj.IN("ctx", "a rendering context"),
        Check(1)..GLint_p.OUT(
            "screen",
            """
            on return, points to the virtual screen associated with the context. The value is always 0 on a single-display system and –1 if the function fails
            for any reason.
            """
        )
    )

    CGLError(
        "UpdateContext",
        "Synchronizes new renderer state to that of the application context",

        CGLContextObj.IN("ctx", "a rendering context")
    )

    // Global library options

    CGLError(
        "SetGlobalOption",
        "Sets the value of a global option.",

        CGLGlobalOption.IN("pname", "the name of the option whose value you want to set", GlobalOptions),
        SingleValue("param")..Check(1)..const..GLint_p.IN("params", "the value to set the option to")
    )

    CGLError(
        "GetGlobalOption",
        "Retrieves the value of a global option.",

        CGLGlobalOption.IN("pname", "the name of the option whose value you want to get", GlobalOptions),
        Check(1)..GLint_p.OUT("params", "on return, a pointer to the value of the option")
    )

    /*CGLError(
        "SetOption",
        "",

        CGLGlobalOption.IN("pname", ""),
        GLint.IN("param", "")
    )

    CGLError(
        "GetOption",
        "",

        CGLGlobalOption.IN("pname", ""),
        GLint_p.IN("param", "")
    )*/

    // Locking functions

    CGLError(
        "LockContext",
        """
        Locks a CGL rendering context.

        The function CGLLockContext blocks the thread it is on until all other threads have unlocked the same context using the function
        #UnlockContext(). You can use CGLLockContext recursively. Context-specific CGL calls by themselves do not require locking, but you can
        guarantee serial processing for a group of calls by surrounding them with CGLLockContext and CGLUnlockContext. Keep in mind that calls from the OpenGL
        API (the API provided by the Architecture Review Board) require locking.

        Applications that use NSOpenGL classes with multithreading can lock contexts using the functions CGLLockContext and CGLUnlockContext. To perform
        rendering in a thread other than the main one, you can lock the context that you want to access and safely execute OpenGL commands. The locking calls
        must be placed around all OpenGL calls in all threads.
        """,

        CGLContextObj.IN("context", "a rendering context")
    )

    CGLError(
        "UnlockContext",
        "Unlocks a CGL rendering context.",

        CGLContextObj.IN("context", "the CGL context to unlock")
    )

    // Version numbers

    void(
        "GetVersion",
        "Gets the major and minor version numbers of the CGL library.",

        Check(1)..GLint_p.OUT("majorvers", "on return, points to the major version number of the CGL library"),
        Check(1)..GLint_p.OUT("minorvers", "on return, points to the minor version number of the CGL library")
    )

    // Convert an error code to a string

    const..charASCII_p(
        "ErrorString",
        "Returns a string that describes the specified result code.",

        CGLError.IN("error", "the CGL result code constant returned from a CGL function", Errors)
    )
}