/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_framebuffer_object.txt">ARB_framebuffer_object</a> extension.
 * 
 * <p>ARB_framebuffer_object is an extension intended to address the following goals:</p>
 * 
 * <ul>
 * <li>Reflect FBO-related functionality found in the OpenGL 3.0 specification.</li>
 * <li>Integrate multiple disjoint extensions into a single ARB extension. These extensions are:
 * 
 * <ul>
 * <li>{@link EXTFramebufferObject EXT_framebuffer_object}</li>
 * <li>{@link EXTFramebufferBlit EXT_framebuffer_blit}</li>
 * <li>{@link EXTFramebufferMultisample EXT_framebuffer_multisample}</li>
 * <li>{@link EXTPackedDepthStencil EXT_packed_depth_stencil}</li>
 * </ul></li>
 * <li>Where appropriate, relax some of the constraints expressed by previous FBO-related extensions. In particular the requirement of matching attachment
 * dimensions and component sizes has been relaxed, to allow implementations the freedom to support more flexible usages where possible.</li>
 * </ul>
 * 
 * <p>ARB_framebuffer_object defines an interface for drawing to rendering destinations other than the buffers provided to the GL by the window-system.</p>
 * 
 * <p>In this extension, these newly defined rendering destinations are known collectively as "framebuffer-attachable images". This extension provides a
 * mechanism for attaching framebuffer-attachable images to the GL framebuffer as one of the standard GL logical buffers: color, depth, and stencil.
 * (Attaching a framebuffer-attachable image to the accum logical buffer is left for a future extension to define). When a framebuffer-attachable image is
 * attached to the framebuffer, it is used as the source and destination of fragment operations as described in Chapter 4.</p>
 * 
 * <p>By allowing the use of a framebuffer-attachable image as a rendering destination, this extension enables a form of "offscreen" rendering. Furthermore,
 * "render to texture" is supported by allowing the images of a texture to be used as framebuffer-attachable images. A particular image of a texture object
 * is selected for use as a framebuffer-attachable image by specifying the mipmap level, cube map face (for a cube map texture), and layer (for a 3D
 * texture) that identifies the image. The "render to texture" semantics of this extension are similar to performing traditional rendering to the
 * framebuffer, followed immediately by a call to CopyTexSubImage. However, by using this extension instead, an application can achieve the same
 * effect, but with the advantage that the GL can usually eliminate the data copy that would have been incurred by calling CopyTexSubImage.</p>
 * 
 * <p>This extension also defines a new GL object type, called a "renderbuffer", which encapsulates a single 2D pixel image. The image of renderbuffer can be
 * used as a framebuffer-attachable image for generalized offscreen rendering and it also provides a means to support rendering to GL logical buffer types
 * which have no corresponding texture format (stencil, accum, etc). A renderbuffer is similar to a texture in that both renderbuffers and textures can be
 * independently allocated and shared among multiple contexts. The framework defined by this extension is general enough that support for attaching images
 * from GL objects other than textures and renderbuffers could be added by layered extensions.</p>
 * 
 * <p>To facilitate efficient switching between collections of framebuffer-attachable images, this extension introduces another new GL object, called a
 * framebuffer object. A framebuffer object contains the state that defines the traditional GL framebuffer, including its set of images. Prior to this
 * extension, it was the window-system which defined and managed this collection of images, traditionally by grouping them into a "drawable". The
 * window-system API's would also provide a function (i.e., {@link WGL#wglMakeCurrent}, {@link GLX#glXMakeCurrent}, aglSetDrawable, etc.) to bind a drawable with a GL
 * context (as is done in the {@link WGLARBPbuffer WGL_ARB_pbuffer} extension). In this extension however, this functionality is subsumed by the GL and the GL provides
 * the function BindFramebuffer to bind a framebuffer object to the current context. Later, the context can bind back to the window-system-provided
 * framebuffer in order to display rendered content.</p>
 * 
 * <p>Previous extensions that enabled rendering to a texture have been much more complicated. One example is the combination of {@code ARB_pbuffer} and
 * {@code ARB_render_texture}, both of which are window-system extensions. This combination requires calling {@code MakeCurrent}, an operation that may be
 * expensive, to switch between the window and the pbuffer drawables. An application must create one pbuffer per renderable texture in order to portably
 * use {@code ARB_render_texture}. An application must maintain at least one GL context per texture format, because each context can only operate on a
 * single pixelformat or {@code FBConfig}. All of these characteristics make {@code ARB_render_texture} both inefficient and cumbersome to use.</p>
 * 
 * <p>ARB_framebuffer_object, on the other hand, is both simpler to use and more efficient than ARB_render_texture. The ARB_framebuffer_object API is
 * contained wholly within the GL API and has no (non-portable) window-system components. Under ARB_framebuffer_object, it is not necessary to create a
 * second GL context when rendering to a texture image whose format differs from that of the window. Finally, unlike the pbuffers of
 * {@code ARB_render_texture}, a single framebuffer object can facilitate rendering to an unlimited number of texture objects.</p>
 * 
 * <p>This extension differs from EXT_framebuffer_object by splitting the framebuffer object binding point into separate DRAW and READ bindings (incorporating
 * functionality introduced by EXT_framebuffer_blit). This allows copying directly from one framebuffer to another. In addition, a new high performance
 * blit function is added to facilitate these blits and perform some data conversion where allowed.</p>
 * 
 * <p>This extension also enables usage of multisampling in conjunction with renderbuffers (incorporating functionality from EXT_packed_depth_stencil), as
 * follows:</p>
 * 
 * <p>The new operation RenderbufferStorageMultisample() allocates storage for a renderbuffer object that can be used as a multisample buffer. A multisample
 * render buffer image differs from a single-sample render buffer image in that a multisample image has a number of {@link GL13#GL_SAMPLES SAMPLES} that is greater than zero.
 * No method is provided for creating multisample texture images.</p>
 * 
 * <p>All of the framebuffer-attachable images attached to a framebuffer object must have the same number of {@link GL13#GL_SAMPLES SAMPLES} or else the framebuffer object is
 * not "framebuffer complete". If a framebuffer object with multisample attachments is "framebuffer complete", then the framebuffer object behaves as if
 * {@link GL13#GL_SAMPLE_BUFFERS SAMPLE_BUFFERS} is one.</p>
 * 
 * <p>In traditional multisample rendering, where {@link #GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is zero and {@link GL13#GL_SAMPLE_BUFFERS SAMPLE_BUFFERS} is one, the GL spec states that "the color sample
 * values are resolved to a single, displayable color each time a pixel is updated." There are, however, several modern hardware implementations that do
 * not actually resolve for each sample update, but instead postpones the resolve operation to a later time and resolve a batch of sample updates at a
 * time. This is OK as long as the implementation behaves "as if" it had resolved a sample-at-a-time. Unfortunately, however, honoring the "as if" rule can
 * sometimes degrade performance.</p>
 * 
 * <p>In contrast, when {@link #GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is an application-created framebuffer object, {@link GL13#GL_MULTISAMPLE MULTISAMPLE} is enabled, and {@link GL13#GL_SAMPLE_BUFFERS SAMPLE_BUFFERS} is one,
 * there is no implicit per-sample-update resolve. Instead, the application explicitly controls when the resolve operation is performed. The resolve
 * operation is affected by calling BlitFramebuffer where the source is a multisample application-created framebuffer object and the destination is a
 * single-sample framebuffer object (either application-created or window-system provided).</p>
 * 
 * <p>This design for multisample resolve more closely matches current hardware, but still permits implementations which choose to resolve a single sample at
 * a time. If hardware that implements the multisample resolution "one sample at a time" exposes ARB_framebuffer_object, it could perform the implicit
 * resolve to a driver-managed hidden surface, then read from that surface when the application calls BlitFramebuffer.</p>
 * 
 * <p>Another motivation for granting the application explicit control over the multisample resolve operation has to do with the flexibility afforded by
 * ARB_framebuffer_object. Previously, a drawable (window or pbuffer) had exclusive access to all of its buffers. There was no mechanism for sharing a
 * buffer across multiple drawables. Under ARB_framebuffer_object, however, a mechanism exists for sharing a framebuffer-attachable image across several
 * framebuffer objects, as well as sharing an image between a framebuffer object and a texture. If we had retained the "implicit" resolve from traditional
 * multisampled rendering, and allowed the creation of "multisample" format renderbuffers, then this type of sharing would have lead to two problematic
 * situations:</p>
 * 
 * <ul>
 * <li>Two contexts, which shared renderbuffers, might perform competing resolve operations into the same single-sample buffer with ambiguous results.</li>
 * <li>It would have introduced the unfortunate ability to use the single-sample buffer as a texture while {@link GL13#GL_MULTISAMPLE MULTISAMPLE} is enabled.</li>
 * </ul>
 * 
 * <p>Using {@link #glBlitFramebuffer BlitFramebuffer} as an explicit resolve to serialize access to the multisampled contents and eliminate the implicit per-sample resolve operation, we avoid both of these problems.</p>
 * 
 * <p>This extension also enables usage of packed depth-stencil formats in renderbuffers (incorporating functionality from EXT_packed_depth_stencil), as
 * follows:</p>
 * 
 * <p>Many OpenGL implementations have chosen to interleave the depth and stencil buffers into one buffer, often with 24 bits of depth precision and 8 bits of
 * stencil data. 32 bits is more than is needed for the depth buffer much of the time; a 24-bit depth buffer, on the other hand, requires that reads and
 * writes of depth data be unaligned with respect to power-of-two boundaries. On the other hand, 8 bits of stencil data is more than sufficient for most
 * applications, so it is only natural to pack the two buffers into a single buffer with both depth and stencil data. OpenGL never provides direct access
 * to the buffers, so the OpenGL implementation can provide an interface to applications where it appears the one merged buffer is composed of two logical buffers.</p>
 * 
 * <p>One disadvantage of this scheme is that OpenGL lacks any means by which this packed data can be handled efficiently. For example, when an application
 * reads from the 24-bit depth buffer, using the type {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT} will lose 8 bits of data, while {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT} has 8 too many. Both require
 * expensive format conversion operations. A 24-bit format would be no more suitable, because it would also suffer from the unaligned memory accesses that
 * made the standalone 24-bit depth buffer an unattractive proposition in the first place.</p>
 * 
 * <p>Many applications, such as parallel rendering applications, may also wish to draw to or read back from both the depth and stencil buffers at the same
 * time. Currently this requires two separate operations, reducing performance. Since the buffers are interleaved, drawing to or reading from both should
 * be no more expensive than using just one; in some cases, it may even be cheaper.</p>
 * 
 * <p>This extension provides a new data format, {@link #GL_DEPTH_STENCIL DEPTH_STENCIL}, that can be used with the {@link GL11#glDrawPixels DrawPixels}, {@link GL11C#glReadPixels ReadPixels}, and {@link GL11#glCopyPixels CopyPixels}
 * commands, as well as a packed data type, {@link #GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, that is meant to be used with {@link #GL_DEPTH_STENCIL DEPTH_STENCIL}. No other data types are supported with
 * {@link #GL_DEPTH_STENCIL DEPTH_STENCIL}. If {@link ARBDepthTexture ARB_depth_texture} or SGIX_depth_texture is supported, {@link #GL_DEPTH_STENCIL DEPTH_STENCIL}/{@link #GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8} data can also be used for textures;
 * this provides a more efficient way to supply data for a 24-bit depth texture.</p>
 * 
 * <p>{@link #GL_DEPTH_STENCIL DEPTH_STENCIL} data, when passed through the pixel path, undergoes both depth and stencil operations. The depth data is scaled and biased by the current
 * {@link GL11#GL_DEPTH_SCALE DEPTH_SCALE} and {@link GL11#GL_DEPTH_BIAS DEPTH_BIAS}, while the stencil data is shifted and offset by the current {@link GL11#GL_INDEX_SHIFT INDEX_SHIFT} and {@link GL11#GL_INDEX_OFFSET INDEX_OFFSET}. The stencil
 * data is also put through the stencil-to-stencil pixel map.</p>
 * 
 * <p>{@link GL11#glDrawPixels DrawPixels} of {@link #GL_DEPTH_STENCIL DEPTH_STENCIL} data operates similarly to that of {@link GL11#GL_STENCIL_INDEX STENCIL_INDEX} data, bypassing the OpenGL fragment pipeline entirely, unlike
 * the treatment of {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT} data. The stencil and depth masks are applied, as are the pixel ownership and scissor tests, but all other
 * operations are skipped.</p>
 * 
 * <p>{@link GL11C#glReadPixels ReadPixels} of {@link #GL_DEPTH_STENCIL DEPTH_STENCIL} data reads back a rectangle from both the depth and stencil buffers.</p>
 * 
 * <p>{@link GL11#glCopyPixels CopyPixels} of {@link #GL_DEPTH_STENCIL DEPTH_STENCIL} data copies a rectangle from both the depth and stencil buffers. Like glDrawPixels, it applies both the stencil and
 * depth masks but skips the remainder of the OpenGL fragment pipeline.</p>
 * 
 * <p>glTex[Sub]Image[1,2,3]D of {@link #GL_DEPTH_STENCIL DEPTH_STENCIL} data loads depth and stencil data into a depth_stencil texture. {@link GL11C#glGetTexImage GetTexImage} of {@link #GL_DEPTH_STENCIL DEPTH_STENCIL} data can be
 * used to retrieve depth and stencil data from a depth/stencil texture.</p>
 * 
 * <p>In addition, a new base internal format, {@link #GL_DEPTH_STENCIL DEPTH_STENCIL}, can be used by both texture images and renderbuffer storage. When an image with a
 * {@link #GL_DEPTH_STENCIL DEPTH_STENCIL} internal format is attached to both the depth and stencil attachment points of a framebuffer object, then it becomes both the depth and
 * stencil buffers of the framebuffer. This fits nicely with hardware that interleaves both depth and stencil data into a single buffer. When a texture
 * with {@link #GL_DEPTH_STENCIL DEPTH_STENCIL} data is bound for texturing, only the depth component is accessible through the texture fetcher. The stencil data can be written
 * with TexImage or CopyTexImage, and can be read with {@link GL11C#glGetTexImage GetTexImage}. When a {@link #GL_DEPTH_STENCIL DEPTH_STENCIL} image is attached to the stencil attachment of the bound
 * framebuffer object, the stencil data can be accessed through any operation that reads from or writes to the framebuffer's stencil buffer.</p>
 * 
 * <p>Glossary of Helpful Terms</p>
 * 
 * <ul>
 * <li><b>logical buffer</b> &ndash; One of the color, depth, or stencil buffers of the framebuffer.</li>
 * <li>framebuffer: The collection of logical buffers and associated state defining where the output of GL rendering is directed.</li>
 * <li>texture: an object which consists of one or more 2D arrays of pixel images and associated state that can be used as a source of data during the texture-mapping process.</li>
 * <li><b>texture image</b> &ndash; one of the 2D arrays of pixels that are part of a texture object. Texture images contain and define the texels of the
 * texture object.</li>
 * <li><b>renderbuffer</b> &ndash; A new type of storage object which contains a single 2D array of pixels and associated state that can be used as a
 * destination for pixel data written during the rendering process.</li>
 * <li><b>renderbuffer image</b> &ndash; The 2D array of pixels that is part of a renderbuffer object. A renderbuffer image contains and defines the pixels
 * of the renderbuffer object.</li>
 * <li><b>framebuffer-attachable image</b> &ndash; A 2D pixel image that can be attached to one of the logical buffer attachment points of a framebuffer
 * object. Texture images and renderbuffer images are two examples of framebuffer-attachable images.</li>
 * <li><b>attachment point</b> &ndash; The set of state which references a specific framebuffer-attachable image, and allows that framebuffer-attachable
 * image to be used to store the contents of a logical buffer of a framebuffer object. There is an attachment point state vector for each color, depth,
 * and stencil buffer of a framebuffer.</li>
 * <li><b>attach</b> &ndash; The act of connecting one object to another object.
 * 
 * <p>An "attach" operation is similar to a "bind" operation in that both represent a reference to the attached or bound object for the purpose of
 * managing object lifetimes and both enable manipulation of the state of the attached or bound object.</p>
 * 
 * <p>However, an "attach" is also different from a "bind" in that "binding" an unused object creates a new object, while "attaching" does not.
 * Additionally, "bind" establishes a connection between a context and an object, while "attach" establishes a connection between two objects.</p>
 * 
 * <p>Finally, if object "A" is attached to object "B" and object "B" is bound to context "C", then in most respects, we treat "A" as if it is
 * <em>implicitly</em> bound to "C".</p></li>
 * <li><b>framebuffer attachment completeness</b> &ndash; Similar to texture "mipmap" or "cube" completeness, defines a minimum set of criteria for
 * framebuffer attachment points.</li>
 * <li><b>framebuffer completeness</b> &ndash; Similar to texture "mipmap cube completeness", defines a composite set of "completeness" requirements and
 * relationships among the attached framebuffer-attachable images.</li>
 * </ul>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public class ARBFramebufferObject {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and
     * GetFramebufferAttachmentParameteriv.
     */
    public static final int
        GL_FRAMEBUFFER      = 0x8D40,
        GL_READ_FRAMEBUFFER = 0x8CA8,
        GL_DRAW_FRAMEBUFFER = 0x8CA9;

    /**
     * Accepted by the {@code target} parameter of BindRenderbuffer, RenderbufferStorage, and GetRenderbufferParameteriv, and returned by
     * GetFramebufferAttachmentParameteriv.
     */
    public static final int GL_RENDERBUFFER = 0x8D41;

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage. */
    public static final int
        GL_STENCIL_INDEX1  = 0x8D46,
        GL_STENCIL_INDEX4  = 0x8D47,
        GL_STENCIL_INDEX8  = 0x8D48,
        GL_STENCIL_INDEX16 = 0x8D49;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
    public static final int
        GL_RENDERBUFFER_WIDTH           = 0x8D42,
        GL_RENDERBUFFER_HEIGHT          = 0x8D43,
        GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44,
        GL_RENDERBUFFER_RED_SIZE        = 0x8D50,
        GL_RENDERBUFFER_GREEN_SIZE      = 0x8D51,
        GL_RENDERBUFFER_BLUE_SIZE       = 0x8D52,
        GL_RENDERBUFFER_ALPHA_SIZE      = 0x8D53,
        GL_RENDERBUFFER_DEPTH_SIZE      = 0x8D54,
        GL_RENDERBUFFER_STENCIL_SIZE    = 0x8D55,
        GL_RENDERBUFFER_SAMPLES         = 0x8CAB;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE           = 0x8CD0,
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME           = 0x8CD1,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL         = 0x8CD2,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER         = 0x8CD4,
        GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING        = 0x8210,
        GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE        = 0x8211,
        GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE              = 0x8212,
        GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE            = 0x8213,
        GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE             = 0x8214,
        GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE            = 0x8215,
        GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE            = 0x8216,
        GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE          = 0x8217;

    /** Returned in {@code params} by GetFramebufferAttachmentParameteriv. */
    public static final int
        GL_UNSIGNED_NORMALIZED = 0x8C17,
        GL_FRAMEBUFFER_DEFAULT = 0x8218,
        GL_INDEX               = 0x8222;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv. */
    public static final int
        GL_COLOR_ATTACHMENT0        = 0x8CE0,
        GL_COLOR_ATTACHMENT1        = 0x8CE1,
        GL_COLOR_ATTACHMENT2        = 0x8CE2,
        GL_COLOR_ATTACHMENT3        = 0x8CE3,
        GL_COLOR_ATTACHMENT4        = 0x8CE4,
        GL_COLOR_ATTACHMENT5        = 0x8CE5,
        GL_COLOR_ATTACHMENT6        = 0x8CE6,
        GL_COLOR_ATTACHMENT7        = 0x8CE7,
        GL_COLOR_ATTACHMENT8        = 0x8CE8,
        GL_COLOR_ATTACHMENT9        = 0x8CE9,
        GL_COLOR_ATTACHMENT10       = 0x8CEA,
        GL_COLOR_ATTACHMENT11       = 0x8CEB,
        GL_COLOR_ATTACHMENT12       = 0x8CEC,
        GL_COLOR_ATTACHMENT13       = 0x8CED,
        GL_COLOR_ATTACHMENT14       = 0x8CEE,
        GL_COLOR_ATTACHMENT15       = 0x8CEF,
        GL_DEPTH_ATTACHMENT         = 0x8D00,
        GL_STENCIL_ATTACHMENT       = 0x8D20,
        GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_MAX_SAMPLES = 0x8D57;

    /** Returned by CheckFramebufferStatus(). */
    public static final int
        GL_FRAMEBUFFER_COMPLETE                      = 0x8CD5,
        GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT         = 0x8CD6,
        GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7,
        GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER        = 0x8CDB,
        GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER        = 0x8CDC,
        GL_FRAMEBUFFER_UNSUPPORTED                   = 0x8CDD,
        GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE        = 0x8D56,
        GL_FRAMEBUFFER_UNDEFINED                     = 0x8219;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev. */
    public static final int
        GL_FRAMEBUFFER_BINDING      = 0x8CA6,
        GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6,
        GL_READ_FRAMEBUFFER_BINDING = 0x8CAA,
        GL_RENDERBUFFER_BINDING     = 0x8CA7,
        GL_MAX_COLOR_ATTACHMENTS    = 0x8CDF,
        GL_MAX_RENDERBUFFER_SIZE    = 0x84E8;

    /** Returned by GetError(). */
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x506;

    /**
     * Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D,
     * CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
     */
    public static final int GL_DEPTH_STENCIL = 0x84F9;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage.
     */
    public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;

    /**
     * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
     * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
     */
    public static final int GL_DEPTH24_STENCIL8 = 0x88F0;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter. */
    public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;

    protected ARBFramebufferObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glIsRenderbuffer ] ---

    /**
     * Determines if a name corresponds to a renderbuffer object.
     *
     * @param renderbuffer a value that may be the name of a renderbuffer object
     */
    @NativeType("GLboolean")
    public static boolean glIsRenderbuffer(@NativeType("GLuint") int renderbuffer) {
        return GL30C.glIsRenderbuffer(renderbuffer);
    }

    // --- [ glBindRenderbuffer ] ---

    /**
     * Binds a renderbuffer to a renderbuffer target.
     *
     * @param target       the renderbuffer target of the binding operation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param renderbuffer the name of the renderbuffer object to bind
     */
    public static void glBindRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer) {
        GL30C.glBindRenderbuffer(target, renderbuffer);
    }

    // --- [ glDeleteRenderbuffers ] ---

    /**
     * Unsafe version of: {@link #glDeleteRenderbuffers DeleteRenderbuffers}
     *
     * @param n the number of renderbuffer objects to be deleted
     */
    public static void nglDeleteRenderbuffers(int n, long renderbuffers) {
        GL30C.nglDeleteRenderbuffers(n, renderbuffers);
    }

    /**
     * Deletes renderbuffer objects.
     *
     * @param renderbuffers an array containing {@code n} renderbuffer objects to be deleted
     */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") IntBuffer renderbuffers) {
        GL30C.glDeleteRenderbuffers(renderbuffers);
    }

    /** Deletes renderbuffer objects. */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int renderbuffer) {
        GL30C.glDeleteRenderbuffers(renderbuffer);
    }

    // --- [ glGenRenderbuffers ] ---

    /**
     * Unsafe version of: {@link #glGenRenderbuffers GenRenderbuffers}
     *
     * @param n the number of renderbuffer object names to generate
     */
    public static void nglGenRenderbuffers(int n, long renderbuffers) {
        GL30C.nglGenRenderbuffers(n, renderbuffers);
    }

    /**
     * Generates renderbuffer object names.
     *
     * @param renderbuffers a buffer in which the generated renderbuffer object names are stored
     */
    public static void glGenRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        GL30C.glGenRenderbuffers(renderbuffers);
    }

    /** Generates renderbuffer object names. */
    @NativeType("void")
    public static int glGenRenderbuffers() {
        return GL30C.glGenRenderbuffers();
    }

    // --- [ glRenderbufferStorage ] ---

    /**
     * Establishes data storage, format and dimensions of a renderbuffer object's image.
     *
     * @param target         the target of the allocation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
     * @param width          the width of the renderbuffer, in pixels
     * @param height         the height of the renderbuffer, in pixels
     */
    public static void glRenderbufferStorage(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL30C.glRenderbufferStorage(target, internalformat, width, height);
    }

    // --- [ glRenderbufferStorageMultisample ] ---

    /**
     * Establishes data storage, format, dimensions and sample count of a renderbuffer object's image.
     * 
     * <p>{@link #glRenderbufferStorage RenderbufferStorage} is equivalent to calling this method with the samples set to zero.</p>
     *
     * @param target         the target of the allocation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param samples        the number of samples to be used for the renderbuffer object's storage
     * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
     * @param width          the width of the renderbuffer, in pixels
     * @param height         the height of the renderbuffer, in pixels
     */
    public static void glRenderbufferStorageMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL30C.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    // --- [ glGetRenderbufferParameteriv ] ---

    /** Unsafe version of: {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv} */
    public static void nglGetRenderbufferParameteriv(int target, int pname, long params) {
        GL30C.nglGetRenderbufferParameteriv(target, pname, params);
    }

    /**
     * Retrieves information about a bound renderbuffer object.
     *
     * @param target the target of the query operation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param pname  the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30C#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30C#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
     * @param params an array to receive the value of the queried parameter
     */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetRenderbufferParameteriv(target, pname, params);
    }

    /**
     * Retrieves information about a bound renderbuffer object.
     *
     * @param target the target of the query operation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param pname  the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30C#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30C#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetRenderbufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL30C.glGetRenderbufferParameteri(target, pname);
    }

    // --- [ glIsFramebuffer ] ---

    /**
     * Determines if a name corresponds to a framebuffer object.
     *
     * @param framebuffer a value that may be the name of a framebuffer object
     */
    @NativeType("GLboolean")
    public static boolean glIsFramebuffer(@NativeType("GLuint") int framebuffer) {
        return GL30C.glIsFramebuffer(framebuffer);
    }

    // --- [ glBindFramebuffer ] ---

    /**
     * Binds a framebuffer to a framebuffer target.
     *
     * @param target      the framebuffer target of the binding operation. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param framebuffer the name of the framebuffer object to bind
     */
    public static void glBindFramebuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer) {
        GL30C.glBindFramebuffer(target, framebuffer);
    }

    // --- [ glDeleteFramebuffers ] ---

    /**
     * Unsafe version of: {@link #glDeleteFramebuffers DeleteFramebuffers}
     *
     * @param n the number of framebuffer objects to be deleted
     */
    public static void nglDeleteFramebuffers(int n, long framebuffers) {
        GL30C.nglDeleteFramebuffers(n, framebuffers);
    }

    /**
     * Deletes framebuffer objects.
     *
     * @param framebuffers an array containing {@code n} framebuffer objects to be deleted
     */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") IntBuffer framebuffers) {
        GL30C.glDeleteFramebuffers(framebuffers);
    }

    /** Deletes framebuffer objects. */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int framebuffer) {
        GL30C.glDeleteFramebuffers(framebuffer);
    }

    // --- [ glGenFramebuffers ] ---

    /**
     * Unsafe version of: {@link #glGenFramebuffers GenFramebuffers}
     *
     * @param n the number of framebuffer object names to generate
     */
    public static void nglGenFramebuffers(int n, long framebuffers) {
        GL30C.nglGenFramebuffers(n, framebuffers);
    }

    /**
     * Generates framebuffer object names.
     *
     * @param framebuffers a buffer in which the generated framebuffer object names are stored
     */
    public static void glGenFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        GL30C.glGenFramebuffers(framebuffers);
    }

    /** Generates framebuffer object names. */
    @NativeType("void")
    public static int glGenFramebuffers() {
        return GL30C.glGenFramebuffers();
    }

    // --- [ glCheckFramebufferStatus ] ---

    /**
     * Checks the completeness status of a framebuffer.
     *
     * @param target the target of the framebuffer completeness check. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     */
    @NativeType("GLenum")
    public static int glCheckFramebufferStatus(@NativeType("GLenum") int target) {
        return GL30C.glCheckFramebufferStatus(target);
    }

    // --- [ glFramebufferTexture1D ] ---

    /**
     * Attaches a level of a 1D texture object as a logical buffer to the currently bound framebuffer object.
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param textarget  the type of texture
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     */
    public static void glFramebufferTexture1D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL30C.glFramebufferTexture1D(target, attachment, textarget, texture, level);
    }

    // --- [ glFramebufferTexture2D ] ---

    /**
     * Attaches a level of a 2D texture object as a logical buffer to the currently bound framebuffer object.
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param textarget  the type of texture
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     */
    public static void glFramebufferTexture2D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL30C.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    // --- [ glFramebufferTexture3D ] ---

    /**
     * Attaches a layer of a 3D texture object as a logical buffer to the currently bound framebuffer object.
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param textarget  the type of texture
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     * @param layer      the layer of a 2-dimensional image within the 3-dimensional texture.
     */
    public static void glFramebufferTexture3D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        GL30C.glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
    }

    // --- [ glFramebufferTextureLayer ] ---

    /**
     * Attaches a single layer of a texture to a framebuffer
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     * @param layer      the layer of {@code texture} to attach.
     */
    public static void glFramebufferTextureLayer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        GL30C.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    // --- [ glFramebufferRenderbuffer ] ---

    /**
     * Attaches a renderbuffer as a logical buffer to the currently bound framebuffer object.
     *
     * @param target             the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment         the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param renderbuffertarget the renderbuffer target. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param renderbuffer       the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach
     */
    public static void glFramebufferRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        GL30C.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    // --- [ glGetFramebufferAttachmentParameteriv ] ---

    /** Unsafe version of: {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv} */
    public static void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
        GL30C.nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    /**
     * Retrievees information about attachments of a bound framebuffer object.
     *
     * @param target     the target of the query operation. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param pname      the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
     * @param params     an array to receive the value of the queried parameter
     */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    /**
     * Retrievees information about attachments of a bound framebuffer object.
     *
     * @param target     the target of the query operation. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param pname      the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetFramebufferAttachmentParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        return GL30C.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    // --- [ glBlitFramebuffer ] ---

    /**
     * Copies a block of pixels from the read framebuffer to the draw framebuffer.
     *
     * @param srcX0  the lower-left coordinate of the source rectangle within the read buffer
     * @param srcY0  the upper-left coordinate of the source rectangle within the read buffer
     * @param srcX1  the lower-right coordinate of the source rectangle within the read buffer
     * @param srcY1  the upper-right coordinate of the source rectangle within the read buffer
     * @param dstX0  the lower-left coordinate of the destination rectangle within the write buffer
     * @param dstY0  the upper-left coordinate of the destination rectangle within the write buffer
     * @param dstX1  the lower-right coordinate of the destination rectangle within the write buffer
     * @param dstY1  the upper-right coordinate of the destination rectangle within the write buffer
     * @param mask   the bitwise OR of the flags indicating which buffers are to be copied. One of:<br><table><tr><td>{@link GL11#GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link GL11#GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link GL11#GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr></table>
     * @param filter the interpolation to be applied if the image is stretched. One of:<br><table><tr><td>{@link GL11#GL_NEAREST NEAREST}</td><td>{@link GL11#GL_LINEAR LINEAR}</td></tr></table>
     */
    public static void glBlitFramebuffer(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        GL30C.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    // --- [ glGenerateMipmap ] ---

    /**
     * Generate mipmaps for a specified texture target.
     *
     * @param target the target to which the texture whose mimaps to generate is bound. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30C#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL30C#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
     */
    public static void glGenerateMipmap(@NativeType("GLenum") int target) {
        GL30C.glGenerateMipmap(target);
    }

    /** Array version of: {@link #glDeleteRenderbuffers DeleteRenderbuffers} */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int[] renderbuffers) {
        GL30C.glDeleteRenderbuffers(renderbuffers);
    }

    /** Array version of: {@link #glGenRenderbuffers GenRenderbuffers} */
    public static void glGenRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        GL30C.glGenRenderbuffers(renderbuffers);
    }

    /** Array version of: {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv} */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetRenderbufferParameteriv(target, pname, params);
    }

    /** Array version of: {@link #glDeleteFramebuffers DeleteFramebuffers} */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int[] framebuffers) {
        GL30C.glDeleteFramebuffers(framebuffers);
    }

    /** Array version of: {@link #glGenFramebuffers GenFramebuffers} */
    public static void glGenFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        GL30C.glGenFramebuffers(framebuffers);
    }

    /** Array version of: {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv} */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

}