/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.egl.*;

/**
 * OpenGL ES-specific swapchain sampler state structure.
 * 
 * <h5>Description</h5>
 * 
 * <p>When {@link XrSwapchainStateSamplerOpenGLESFB} is specified in the call to {@link FBSwapchainUpdateState#xrUpdateSwapchainFB UpdateSwapchainFB}, texture sampler state for all images in the {@code XrSwapchain} will be updated for both the application and compositor processes.</p>
 * 
 * <p>For most cases, the sampler state update is only required compositor-side, as that is where the swapchain images are sampled. For completeness, the application-side sampler state is additionally updated to support cases where the application may choose to directly sample the swapchain images.</p>
 * 
 * <p>Applications are expected to handle synchronization of the sampler state update with application-side rendering. Similarly, the compositor will synchronize the sampler state update with rendering of the next compositor frame.</p>
 * 
 * <p>An {@code EGLContext}, either the {@code EGLContext} bound during {@code XrSwapchain} creation or an {@code EGLContext} in the same share group, is required to be bound on the application calling thread. Current texture bindings may be altered by the call, including the active texture.</p>
 * 
 * <p>When {@link XrSwapchainStateSamplerOpenGLESFB} is specified in the call to {@link FBSwapchainUpdateState#xrGetSwapchainStateFB GetSwapchainStateFB}, the sampler state will be populated with the current swapchain sampler state.</p>
 * 
 * <p>To use {@link XrSwapchainStateSamplerOpenGLESFB}, {@link XR10#XR_USE_GRAPHICS_API_OPENGL_ES USE_GRAPHICS_API_OPENGL_ES} must be defined before including {@code openxr_platform.h}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSwapchainUpdateStateOpenGLES XR_FB_swapchain_update_state_opengl_es} extension <b>must</b> be enabled prior to using {@link XrSwapchainStateSamplerOpenGLESFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSwapchainUpdateStateOpenGLES#XR_TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code minFilter} <b>must</b> be a valid {@code EGLenum} value</li>
 * <li>{@code magFilter} <b>must</b> be a valid {@code EGLenum} value</li>
 * <li>{@code wrapModeS} <b>must</b> be a valid {@code EGLenum} value</li>
 * <li>{@code wrapModeT} <b>must</b> be a valid {@code EGLenum} value</li>
 * <li>{@code swizzleRed} <b>must</b> be a valid {@code EGLenum} value</li>
 * <li>{@code swizzleGreen} <b>must</b> be a valid {@code EGLenum} value</li>
 * <li>{@code swizzleBlue} <b>must</b> be a valid {@code EGLenum} value</li>
 * <li>{@code swizzleAlpha} <b>must</b> be a valid {@code EGLenum} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrColor4f}, {@link FBSwapchainUpdateState#xrGetSwapchainStateFB GetSwapchainStateFB}, {@link FBSwapchainUpdateState#xrUpdateSwapchainFB UpdateSwapchainFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSwapchainStateSamplerOpenGLESFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     EGLenum {@link #minFilter};
 *     EGLenum {@link #magFilter};
 *     EGLenum {@link #wrapModeS};
 *     EGLenum {@link #wrapModeT};
 *     EGLenum {@link #swizzleRed};
 *     EGLenum {@link #swizzleGreen};
 *     EGLenum {@link #swizzleBlue};
 *     EGLenum {@link #swizzleAlpha};
 *     float {@link #maxAnisotropy};
 *     {@link XrColor4f XrColor4f} {@link #borderColor};
 * }</code></pre>
 */
public class XrSwapchainStateSamplerOpenGLESFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MINFILTER,
        MAGFILTER,
        WRAPMODES,
        WRAPMODET,
        SWIZZLERED,
        SWIZZLEGREEN,
        SWIZZLEBLUE,
        SWIZZLEALPHA,
        MAXANISOTROPY,
        BORDERCOLOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(XrColor4f.SIZEOF, XrColor4f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MINFILTER = layout.offsetof(2);
        MAGFILTER = layout.offsetof(3);
        WRAPMODES = layout.offsetof(4);
        WRAPMODET = layout.offsetof(5);
        SWIZZLERED = layout.offsetof(6);
        SWIZZLEGREEN = layout.offsetof(7);
        SWIZZLEBLUE = layout.offsetof(8);
        SWIZZLEALPHA = layout.offsetof(9);
        MAXANISOTROPY = layout.offsetof(10);
        BORDERCOLOR = layout.offsetof(11);
    }

    /**
     * Creates a {@code XrSwapchainStateSamplerOpenGLESFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainStateSamplerOpenGLESFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** a valid Android OpenGL ES {@code EGLenum}. */
    @NativeType("EGLenum")
    public int minFilter() { return nminFilter(address()); }
    /** a valid Android OpenGL ES {@code EGLenum}. */
    @NativeType("EGLenum")
    public int magFilter() { return nmagFilter(address()); }
    /** a valid Android OpenGL ES {@code EGLenum}. */
    @NativeType("EGLenum")
    public int wrapModeS() { return nwrapModeS(address()); }
    /** a valid Android OpenGL ES {@code EGLenum}. */
    @NativeType("EGLenum")
    public int wrapModeT() { return nwrapModeT(address()); }
    /** a valid Android OpenGL ES {@code EGLenum}. */
    @NativeType("EGLenum")
    public int swizzleRed() { return nswizzleRed(address()); }
    /** a valid Android OpenGL ES {@code EGLenum}. */
    @NativeType("EGLenum")
    public int swizzleGreen() { return nswizzleGreen(address()); }
    /** a valid Android OpenGL ES {@code EGLenum}. */
    @NativeType("EGLenum")
    public int swizzleBlue() { return nswizzleBlue(address()); }
    /** a valid Android OpenGL ES {@code EGLenum}. */
    @NativeType("EGLenum")
    public int swizzleAlpha() { return nswizzleAlpha(address()); }
    /** a valid float used to represent max anisotropy. */
    public float maxAnisotropy() { return nmaxAnisotropy(address()); }
    /** an RGBA color to be used as border texels. */
    public XrColor4f borderColor() { return nborderColor(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSwapchainStateSamplerOpenGLESFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSwapchainUpdateStateOpenGLES#XR_TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB} value to the {@link #type} field. */
    public XrSwapchainStateSamplerOpenGLESFB type$Default() { return type(FBSwapchainUpdateStateOpenGLES.XR_TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSwapchainStateSamplerOpenGLESFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #minFilter} field. */
    public XrSwapchainStateSamplerOpenGLESFB minFilter(@NativeType("EGLenum") int value) { nminFilter(address(), value); return this; }
    /** Sets the specified value to the {@link #magFilter} field. */
    public XrSwapchainStateSamplerOpenGLESFB magFilter(@NativeType("EGLenum") int value) { nmagFilter(address(), value); return this; }
    /** Sets the specified value to the {@link #wrapModeS} field. */
    public XrSwapchainStateSamplerOpenGLESFB wrapModeS(@NativeType("EGLenum") int value) { nwrapModeS(address(), value); return this; }
    /** Sets the specified value to the {@link #wrapModeT} field. */
    public XrSwapchainStateSamplerOpenGLESFB wrapModeT(@NativeType("EGLenum") int value) { nwrapModeT(address(), value); return this; }
    /** Sets the specified value to the {@link #swizzleRed} field. */
    public XrSwapchainStateSamplerOpenGLESFB swizzleRed(@NativeType("EGLenum") int value) { nswizzleRed(address(), value); return this; }
    /** Sets the specified value to the {@link #swizzleGreen} field. */
    public XrSwapchainStateSamplerOpenGLESFB swizzleGreen(@NativeType("EGLenum") int value) { nswizzleGreen(address(), value); return this; }
    /** Sets the specified value to the {@link #swizzleBlue} field. */
    public XrSwapchainStateSamplerOpenGLESFB swizzleBlue(@NativeType("EGLenum") int value) { nswizzleBlue(address(), value); return this; }
    /** Sets the specified value to the {@link #swizzleAlpha} field. */
    public XrSwapchainStateSamplerOpenGLESFB swizzleAlpha(@NativeType("EGLenum") int value) { nswizzleAlpha(address(), value); return this; }
    /** Sets the specified value to the {@link #maxAnisotropy} field. */
    public XrSwapchainStateSamplerOpenGLESFB maxAnisotropy(float value) { nmaxAnisotropy(address(), value); return this; }
    /** Copies the specified {@link XrColor4f} to the {@link #borderColor} field. */
    public XrSwapchainStateSamplerOpenGLESFB borderColor(XrColor4f value) { nborderColor(address(), value); return this; }
    /** Passes the {@link #borderColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSwapchainStateSamplerOpenGLESFB borderColor(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(borderColor()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainStateSamplerOpenGLESFB set(
        int type,
        long next,
        int minFilter,
        int magFilter,
        int wrapModeS,
        int wrapModeT,
        int swizzleRed,
        int swizzleGreen,
        int swizzleBlue,
        int swizzleAlpha,
        float maxAnisotropy,
        XrColor4f borderColor
    ) {
        type(type);
        next(next);
        minFilter(minFilter);
        magFilter(magFilter);
        wrapModeS(wrapModeS);
        wrapModeT(wrapModeT);
        swizzleRed(swizzleRed);
        swizzleGreen(swizzleGreen);
        swizzleBlue(swizzleBlue);
        swizzleAlpha(swizzleAlpha);
        maxAnisotropy(maxAnisotropy);
        borderColor(borderColor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainStateSamplerOpenGLESFB set(XrSwapchainStateSamplerOpenGLESFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainStateSamplerOpenGLESFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainStateSamplerOpenGLESFB malloc() {
        return wrap(XrSwapchainStateSamplerOpenGLESFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSwapchainStateSamplerOpenGLESFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainStateSamplerOpenGLESFB calloc() {
        return wrap(XrSwapchainStateSamplerOpenGLESFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSwapchainStateSamplerOpenGLESFB} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainStateSamplerOpenGLESFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSwapchainStateSamplerOpenGLESFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainStateSamplerOpenGLESFB} instance for the specified memory address. */
    public static XrSwapchainStateSamplerOpenGLESFB create(long address) {
        return wrap(XrSwapchainStateSamplerOpenGLESFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainStateSamplerOpenGLESFB createSafe(long address) {
        return address == NULL ? null : wrap(XrSwapchainStateSamplerOpenGLESFB.class, address);
    }

    /** Downcasts the specified {@code XrSwapchainStateBaseHeaderFB} instance to {@code XrSwapchainStateSamplerOpenGLESFB}. */
    public static XrSwapchainStateSamplerOpenGLESFB create(XrSwapchainStateBaseHeaderFB value) {
        return wrap(XrSwapchainStateSamplerOpenGLESFB.class, value);
    }

    /**
     * Returns a new {@link XrSwapchainStateSamplerOpenGLESFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerOpenGLESFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainStateSamplerOpenGLESFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerOpenGLESFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainStateSamplerOpenGLESFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerOpenGLESFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSwapchainStateSamplerOpenGLESFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerOpenGLESFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainStateSamplerOpenGLESFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrSwapchainStateBaseHeaderFB.Buffer} instance to {@code XrSwapchainStateSamplerOpenGLESFB.Buffer}. */
    public static XrSwapchainStateSamplerOpenGLESFB.Buffer create(XrSwapchainStateBaseHeaderFB.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrSwapchainStateSamplerOpenGLESFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainStateSamplerOpenGLESFB malloc(MemoryStack stack) {
        return wrap(XrSwapchainStateSamplerOpenGLESFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSwapchainStateSamplerOpenGLESFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainStateSamplerOpenGLESFB calloc(MemoryStack stack) {
        return wrap(XrSwapchainStateSamplerOpenGLESFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSwapchainStateSamplerOpenGLESFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerOpenGLESFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainStateSamplerOpenGLESFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerOpenGLESFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainStateSamplerOpenGLESFB.NEXT); }
    /** Unsafe version of {@link #minFilter}. */
    public static int nminFilter(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.MINFILTER); }
    /** Unsafe version of {@link #magFilter}. */
    public static int nmagFilter(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.MAGFILTER); }
    /** Unsafe version of {@link #wrapModeS}. */
    public static int nwrapModeS(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.WRAPMODES); }
    /** Unsafe version of {@link #wrapModeT}. */
    public static int nwrapModeT(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.WRAPMODET); }
    /** Unsafe version of {@link #swizzleRed}. */
    public static int nswizzleRed(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.SWIZZLERED); }
    /** Unsafe version of {@link #swizzleGreen}. */
    public static int nswizzleGreen(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.SWIZZLEGREEN); }
    /** Unsafe version of {@link #swizzleBlue}. */
    public static int nswizzleBlue(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.SWIZZLEBLUE); }
    /** Unsafe version of {@link #swizzleAlpha}. */
    public static int nswizzleAlpha(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.SWIZZLEALPHA); }
    /** Unsafe version of {@link #maxAnisotropy}. */
    public static float nmaxAnisotropy(long struct) { return UNSAFE.getFloat(null, struct + XrSwapchainStateSamplerOpenGLESFB.MAXANISOTROPY); }
    /** Unsafe version of {@link #borderColor}. */
    public static XrColor4f nborderColor(long struct) { return XrColor4f.create(struct + XrSwapchainStateSamplerOpenGLESFB.BORDERCOLOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainStateSamplerOpenGLESFB.NEXT, value); }
    /** Unsafe version of {@link #minFilter(int) minFilter}. */
    public static void nminFilter(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.MINFILTER, value); }
    /** Unsafe version of {@link #magFilter(int) magFilter}. */
    public static void nmagFilter(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.MAGFILTER, value); }
    /** Unsafe version of {@link #wrapModeS(int) wrapModeS}. */
    public static void nwrapModeS(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.WRAPMODES, value); }
    /** Unsafe version of {@link #wrapModeT(int) wrapModeT}. */
    public static void nwrapModeT(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.WRAPMODET, value); }
    /** Unsafe version of {@link #swizzleRed(int) swizzleRed}. */
    public static void nswizzleRed(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.SWIZZLERED, value); }
    /** Unsafe version of {@link #swizzleGreen(int) swizzleGreen}. */
    public static void nswizzleGreen(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.SWIZZLEGREEN, value); }
    /** Unsafe version of {@link #swizzleBlue(int) swizzleBlue}. */
    public static void nswizzleBlue(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.SWIZZLEBLUE, value); }
    /** Unsafe version of {@link #swizzleAlpha(int) swizzleAlpha}. */
    public static void nswizzleAlpha(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainStateSamplerOpenGLESFB.SWIZZLEALPHA, value); }
    /** Unsafe version of {@link #maxAnisotropy(float) maxAnisotropy}. */
    public static void nmaxAnisotropy(long struct, float value) { UNSAFE.putFloat(null, struct + XrSwapchainStateSamplerOpenGLESFB.MAXANISOTROPY, value); }
    /** Unsafe version of {@link #borderColor(XrColor4f) borderColor}. */
    public static void nborderColor(long struct, XrColor4f value) { memCopy(value.address(), struct + XrSwapchainStateSamplerOpenGLESFB.BORDERCOLOR, XrColor4f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSwapchainStateSamplerOpenGLESFB} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainStateSamplerOpenGLESFB, Buffer> implements NativeResource {

        private static final XrSwapchainStateSamplerOpenGLESFB ELEMENT_FACTORY = XrSwapchainStateSamplerOpenGLESFB.create(-1L);

        /**
         * Creates a new {@code XrSwapchainStateSamplerOpenGLESFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainStateSamplerOpenGLESFB#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrSwapchainStateSamplerOpenGLESFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSwapchainStateSamplerOpenGLESFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainStateSamplerOpenGLESFB.ntype(address()); }
        /** @return the value of the {@link XrSwapchainStateSamplerOpenGLESFB#next} field. */
        @NativeType("void *")
        public long next() { return XrSwapchainStateSamplerOpenGLESFB.nnext(address()); }
        /** @return the value of the {@link XrSwapchainStateSamplerOpenGLESFB#minFilter} field. */
        @NativeType("EGLenum")
        public int minFilter() { return XrSwapchainStateSamplerOpenGLESFB.nminFilter(address()); }
        /** @return the value of the {@link XrSwapchainStateSamplerOpenGLESFB#magFilter} field. */
        @NativeType("EGLenum")
        public int magFilter() { return XrSwapchainStateSamplerOpenGLESFB.nmagFilter(address()); }
        /** @return the value of the {@link XrSwapchainStateSamplerOpenGLESFB#wrapModeS} field. */
        @NativeType("EGLenum")
        public int wrapModeS() { return XrSwapchainStateSamplerOpenGLESFB.nwrapModeS(address()); }
        /** @return the value of the {@link XrSwapchainStateSamplerOpenGLESFB#wrapModeT} field. */
        @NativeType("EGLenum")
        public int wrapModeT() { return XrSwapchainStateSamplerOpenGLESFB.nwrapModeT(address()); }
        /** @return the value of the {@link XrSwapchainStateSamplerOpenGLESFB#swizzleRed} field. */
        @NativeType("EGLenum")
        public int swizzleRed() { return XrSwapchainStateSamplerOpenGLESFB.nswizzleRed(address()); }
        /** @return the value of the {@link XrSwapchainStateSamplerOpenGLESFB#swizzleGreen} field. */
        @NativeType("EGLenum")
        public int swizzleGreen() { return XrSwapchainStateSamplerOpenGLESFB.nswizzleGreen(address()); }
        /** @return the value of the {@link XrSwapchainStateSamplerOpenGLESFB#swizzleBlue} field. */
        @NativeType("EGLenum")
        public int swizzleBlue() { return XrSwapchainStateSamplerOpenGLESFB.nswizzleBlue(address()); }
        /** @return the value of the {@link XrSwapchainStateSamplerOpenGLESFB#swizzleAlpha} field. */
        @NativeType("EGLenum")
        public int swizzleAlpha() { return XrSwapchainStateSamplerOpenGLESFB.nswizzleAlpha(address()); }
        /** @return the value of the {@link XrSwapchainStateSamplerOpenGLESFB#maxAnisotropy} field. */
        public float maxAnisotropy() { return XrSwapchainStateSamplerOpenGLESFB.nmaxAnisotropy(address()); }
        /** @return a {@link XrColor4f} view of the {@link XrSwapchainStateSamplerOpenGLESFB#borderColor} field. */
        public XrColor4f borderColor() { return XrSwapchainStateSamplerOpenGLESFB.nborderColor(address()); }

        /** Sets the specified value to the {@link XrSwapchainStateSamplerOpenGLESFB#type} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainStateSamplerOpenGLESFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSwapchainUpdateStateOpenGLES#XR_TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB} value to the {@link XrSwapchainStateSamplerOpenGLESFB#type} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer type$Default() { return type(FBSwapchainUpdateStateOpenGLES.XR_TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB); }
        /** Sets the specified value to the {@link XrSwapchainStateSamplerOpenGLESFB#next} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer next(@NativeType("void *") long value) { XrSwapchainStateSamplerOpenGLESFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainStateSamplerOpenGLESFB#minFilter} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer minFilter(@NativeType("EGLenum") int value) { XrSwapchainStateSamplerOpenGLESFB.nminFilter(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainStateSamplerOpenGLESFB#magFilter} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer magFilter(@NativeType("EGLenum") int value) { XrSwapchainStateSamplerOpenGLESFB.nmagFilter(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainStateSamplerOpenGLESFB#wrapModeS} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer wrapModeS(@NativeType("EGLenum") int value) { XrSwapchainStateSamplerOpenGLESFB.nwrapModeS(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainStateSamplerOpenGLESFB#wrapModeT} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer wrapModeT(@NativeType("EGLenum") int value) { XrSwapchainStateSamplerOpenGLESFB.nwrapModeT(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainStateSamplerOpenGLESFB#swizzleRed} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer swizzleRed(@NativeType("EGLenum") int value) { XrSwapchainStateSamplerOpenGLESFB.nswizzleRed(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainStateSamplerOpenGLESFB#swizzleGreen} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer swizzleGreen(@NativeType("EGLenum") int value) { XrSwapchainStateSamplerOpenGLESFB.nswizzleGreen(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainStateSamplerOpenGLESFB#swizzleBlue} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer swizzleBlue(@NativeType("EGLenum") int value) { XrSwapchainStateSamplerOpenGLESFB.nswizzleBlue(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainStateSamplerOpenGLESFB#swizzleAlpha} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer swizzleAlpha(@NativeType("EGLenum") int value) { XrSwapchainStateSamplerOpenGLESFB.nswizzleAlpha(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainStateSamplerOpenGLESFB#maxAnisotropy} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer maxAnisotropy(float value) { XrSwapchainStateSamplerOpenGLESFB.nmaxAnisotropy(address(), value); return this; }
        /** Copies the specified {@link XrColor4f} to the {@link XrSwapchainStateSamplerOpenGLESFB#borderColor} field. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer borderColor(XrColor4f value) { XrSwapchainStateSamplerOpenGLESFB.nborderColor(address(), value); return this; }
        /** Passes the {@link XrSwapchainStateSamplerOpenGLESFB#borderColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSwapchainStateSamplerOpenGLESFB.Buffer borderColor(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(borderColor()); return this; }

    }

}