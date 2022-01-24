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

/**
 * End frame information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_FRAME_END_INFO TYPE_FRAME_END_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrSecondaryViewConfigurationFrameEndInfoMSFT}</li>
 * <li>{@code environmentBlendMode} <b>must</b> be a valid {@code XrEnvironmentBlendMode} value</li>
 * <li>If {@code layerCount} is not 0, {@code layers} <b>must</b> be a pointer to an array of {@code layerCount} valid {@link XrCompositionLayerBaseHeader}-based structures. See also: {@link XrCompositionLayerCubeKHR}, {@link XrCompositionLayerCylinderKHR}, {@link XrCompositionLayerEquirect2KHR}, {@link XrCompositionLayerEquirectKHR}, {@link XrCompositionLayerProjection}, {@link XrCompositionLayerQuad}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}, {@link XR10#xrEndFrame EndFrame}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFrameEndInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrTime {@link #displayTime};
 *     XrEnvironmentBlendMode {@link #environmentBlendMode};
 *     uint32_t {@link #layerCount};
 *     {@link XrCompositionLayerBaseHeader XrCompositionLayerBaseHeader} const * const * {@link #layers};
 * }</code></pre>
 */
public class XrFrameEndInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DISPLAYTIME,
        ENVIRONMENTBLENDMODE,
        LAYERCOUNT,
        LAYERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DISPLAYTIME = layout.offsetof(2);
        ENVIRONMENTBLENDMODE = layout.offsetof(3);
        LAYERCOUNT = layout.offsetof(4);
        LAYERS = layout.offsetof(5);
    }

    /**
     * Creates a {@code XrFrameEndInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFrameEndInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@code XrTime} at which this frame <b>should</b> be displayed. */
    @NativeType("XrTime")
    public long displayTime() { return ndisplayTime(address()); }
    /** the {@code XrEnvironmentBlendMode} value representing the desired <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#environment_blend_mode">environment blend mode</a> for this frame. */
    @NativeType("XrEnvironmentBlendMode")
    public int environmentBlendMode() { return nenvironmentBlendMode(address()); }
    /** the number of composition layers in this frame. The maximum supported layer count is identified by {@link XrSystemGraphicsProperties}::maxLayerCount. If layerCount is greater than the maximum supported layer count then {@link XR10#XR_ERROR_LAYER_LIMIT_EXCEEDED ERROR_LAYER_LIMIT_EXCEEDED} <b>must</b> be returned. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }
    /** a pointer to an array of {@link XrCompositionLayerBaseHeader} pointers. */
    @Nullable
    @NativeType("XrCompositionLayerBaseHeader const * const *")
    public PointerBuffer layers() { return nlayers(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFrameEndInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_FRAME_END_INFO TYPE_FRAME_END_INFO} value to the {@link #type} field. */
    public XrFrameEndInfo type$Default() { return type(XR10.XR_TYPE_FRAME_END_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFrameEndInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSecondaryViewConfigurationFrameEndInfoMSFT} value to the {@code next} chain. */
    public XrFrameEndInfo next(XrSecondaryViewConfigurationFrameEndInfoMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #displayTime} field. */
    public XrFrameEndInfo displayTime(@NativeType("XrTime") long value) { ndisplayTime(address(), value); return this; }
    /** Sets the specified value to the {@link #environmentBlendMode} field. */
    public XrFrameEndInfo environmentBlendMode(@NativeType("XrEnvironmentBlendMode") int value) { nenvironmentBlendMode(address(), value); return this; }
    /** Sets the specified value to the {@link #layerCount} field. */
    public XrFrameEndInfo layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #layers} field. */
    public XrFrameEndInfo layers(@Nullable @NativeType("XrCompositionLayerBaseHeader const * const *") PointerBuffer value) { nlayers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFrameEndInfo set(
        int type,
        long next,
        long displayTime,
        int environmentBlendMode,
        int layerCount,
        @Nullable PointerBuffer layers
    ) {
        type(type);
        next(next);
        displayTime(displayTime);
        environmentBlendMode(environmentBlendMode);
        layerCount(layerCount);
        layers(layers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFrameEndInfo set(XrFrameEndInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFrameEndInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFrameEndInfo malloc() {
        return wrap(XrFrameEndInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrFrameEndInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFrameEndInfo calloc() {
        return wrap(XrFrameEndInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrFrameEndInfo} instance allocated with {@link BufferUtils}. */
    public static XrFrameEndInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrFrameEndInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrFrameEndInfo} instance for the specified memory address. */
    public static XrFrameEndInfo create(long address) {
        return wrap(XrFrameEndInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFrameEndInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrFrameEndInfo.class, address);
    }

    /**
     * Returns a new {@link XrFrameEndInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFrameEndInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameEndInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrFrameEndInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFrameEndInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrFrameEndInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameEndInfo malloc(MemoryStack stack) {
        return wrap(XrFrameEndInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrFrameEndInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameEndInfo calloc(MemoryStack stack) {
        return wrap(XrFrameEndInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrFrameEndInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameEndInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFrameEndInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFrameEndInfo.NEXT); }
    /** Unsafe version of {@link #displayTime}. */
    public static long ndisplayTime(long struct) { return UNSAFE.getLong(null, struct + XrFrameEndInfo.DISPLAYTIME); }
    /** Unsafe version of {@link #environmentBlendMode}. */
    public static int nenvironmentBlendMode(long struct) { return UNSAFE.getInt(null, struct + XrFrameEndInfo.ENVIRONMENTBLENDMODE); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return UNSAFE.getInt(null, struct + XrFrameEndInfo.LAYERCOUNT); }
    /** Unsafe version of {@link #layers() layers}. */
    @Nullable public static PointerBuffer nlayers(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrFrameEndInfo.LAYERS), nlayerCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFrameEndInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFrameEndInfo.NEXT, value); }
    /** Unsafe version of {@link #displayTime(long) displayTime}. */
    public static void ndisplayTime(long struct, long value) { UNSAFE.putLong(null, struct + XrFrameEndInfo.DISPLAYTIME, value); }
    /** Unsafe version of {@link #environmentBlendMode(int) environmentBlendMode}. */
    public static void nenvironmentBlendMode(long struct, int value) { UNSAFE.putInt(null, struct + XrFrameEndInfo.ENVIRONMENTBLENDMODE, value); }
    /** Sets the specified value to the {@code layerCount} field of the specified {@code struct}. */
    public static void nlayerCount(long struct, int value) { UNSAFE.putInt(null, struct + XrFrameEndInfo.LAYERCOUNT, value); }
    /** Unsafe version of {@link #layers(PointerBuffer) layers}. */
    public static void nlayers(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrFrameEndInfo.LAYERS, memAddressSafe(value)); if (value != null) { nlayerCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrFrameEndInfo} structs. */
    public static class Buffer extends StructBuffer<XrFrameEndInfo, Buffer> implements NativeResource {

        private static final XrFrameEndInfo ELEMENT_FACTORY = XrFrameEndInfo.create(-1L);

        /**
         * Creates a new {@code XrFrameEndInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFrameEndInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrFrameEndInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFrameEndInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFrameEndInfo.ntype(address()); }
        /** @return the value of the {@link XrFrameEndInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrFrameEndInfo.nnext(address()); }
        /** @return the value of the {@link XrFrameEndInfo#displayTime} field. */
        @NativeType("XrTime")
        public long displayTime() { return XrFrameEndInfo.ndisplayTime(address()); }
        /** @return the value of the {@link XrFrameEndInfo#environmentBlendMode} field. */
        @NativeType("XrEnvironmentBlendMode")
        public int environmentBlendMode() { return XrFrameEndInfo.nenvironmentBlendMode(address()); }
        /** @return the value of the {@link XrFrameEndInfo#layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return XrFrameEndInfo.nlayerCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link XrFrameEndInfo#layers} field. */
        @Nullable
        @NativeType("XrCompositionLayerBaseHeader const * const *")
        public PointerBuffer layers() { return XrFrameEndInfo.nlayers(address()); }

        /** Sets the specified value to the {@link XrFrameEndInfo#type} field. */
        public XrFrameEndInfo.Buffer type(@NativeType("XrStructureType") int value) { XrFrameEndInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_FRAME_END_INFO TYPE_FRAME_END_INFO} value to the {@link XrFrameEndInfo#type} field. */
        public XrFrameEndInfo.Buffer type$Default() { return type(XR10.XR_TYPE_FRAME_END_INFO); }
        /** Sets the specified value to the {@link XrFrameEndInfo#next} field. */
        public XrFrameEndInfo.Buffer next(@NativeType("void const *") long value) { XrFrameEndInfo.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSecondaryViewConfigurationFrameEndInfoMSFT} value to the {@code next} chain. */
        public XrFrameEndInfo.Buffer next(XrSecondaryViewConfigurationFrameEndInfoMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrFrameEndInfo#displayTime} field. */
        public XrFrameEndInfo.Buffer displayTime(@NativeType("XrTime") long value) { XrFrameEndInfo.ndisplayTime(address(), value); return this; }
        /** Sets the specified value to the {@link XrFrameEndInfo#environmentBlendMode} field. */
        public XrFrameEndInfo.Buffer environmentBlendMode(@NativeType("XrEnvironmentBlendMode") int value) { XrFrameEndInfo.nenvironmentBlendMode(address(), value); return this; }
        /** Sets the specified value to the {@link XrFrameEndInfo#layerCount} field. */
        public XrFrameEndInfo.Buffer layerCount(@NativeType("uint32_t") int value) { XrFrameEndInfo.nlayerCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link XrFrameEndInfo#layers} field. */
        public XrFrameEndInfo.Buffer layers(@Nullable @NativeType("XrCompositionLayerBaseHeader const * const *") PointerBuffer value) { XrFrameEndInfo.nlayers(address(), value); return this; }

    }

}