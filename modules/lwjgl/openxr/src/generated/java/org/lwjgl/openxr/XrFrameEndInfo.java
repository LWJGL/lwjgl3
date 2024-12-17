/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrFrameEndInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrTime displayTime;
 *     XrEnvironmentBlendMode environmentBlendMode;
 *     uint32_t layerCount;
 *     {@link XrCompositionLayerBaseHeader XrCompositionLayerBaseHeader} const * const * layers;
 * }}</pre>
 */
public class XrFrameEndInfo extends Struct<XrFrameEndInfo> implements NativeResource {

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

    protected XrFrameEndInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFrameEndInfo create(long address, @Nullable ByteBuffer container) {
        return new XrFrameEndInfo(address, container);
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

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code displayTime} field. */
    @NativeType("XrTime")
    public long displayTime() { return ndisplayTime(address()); }
    /** @return the value of the {@code environmentBlendMode} field. */
    @NativeType("XrEnvironmentBlendMode")
    public int environmentBlendMode() { return nenvironmentBlendMode(address()); }
    /** @return the value of the {@code layerCount} field. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code layers} field. */
    @NativeType("XrCompositionLayerBaseHeader const * const *")
    public @Nullable PointerBuffer layers() { return nlayers(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFrameEndInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_FRAME_END_INFO TYPE_FRAME_END_INFO} value to the {@code type} field. */
    public XrFrameEndInfo type$Default() { return type(XR10.XR_TYPE_FRAME_END_INFO); }
    /** Sets the specified value to the {@code next} field. */
    public XrFrameEndInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrFrameEndInfoML} value to the {@code next} chain. */
    public XrFrameEndInfo next(XrFrameEndInfoML value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrGlobalDimmerFrameEndInfoML} value to the {@code next} chain. */
    public XrFrameEndInfo next(XrGlobalDimmerFrameEndInfoML value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrLocalDimmingFrameEndInfoMETA} value to the {@code next} chain. */
    public XrFrameEndInfo next(XrLocalDimmingFrameEndInfoMETA value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSecondaryViewConfigurationFrameEndInfoMSFT} value to the {@code next} chain. */
    public XrFrameEndInfo next(XrSecondaryViewConfigurationFrameEndInfoMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code displayTime} field. */
    public XrFrameEndInfo displayTime(@NativeType("XrTime") long value) { ndisplayTime(address(), value); return this; }
    /** Sets the specified value to the {@code environmentBlendMode} field. */
    public XrFrameEndInfo environmentBlendMode(@NativeType("XrEnvironmentBlendMode") int value) { nenvironmentBlendMode(address(), value); return this; }
    /** Sets the specified value to the {@code layerCount} field. */
    public XrFrameEndInfo layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code layers} field. */
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
        return new XrFrameEndInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFrameEndInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFrameEndInfo calloc() {
        return new XrFrameEndInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFrameEndInfo} instance allocated with {@link BufferUtils}. */
    public static XrFrameEndInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFrameEndInfo(memAddress(container), container);
    }

    /** Returns a new {@code XrFrameEndInfo} instance for the specified memory address. */
    public static XrFrameEndInfo create(long address) {
        return new XrFrameEndInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFrameEndInfo createSafe(long address) {
        return address == NULL ? null : new XrFrameEndInfo(address, null);
    }

    /**
     * Returns a new {@link XrFrameEndInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFrameEndInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameEndInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFrameEndInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFrameEndInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFrameEndInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameEndInfo malloc(MemoryStack stack) {
        return new XrFrameEndInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFrameEndInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameEndInfo calloc(MemoryStack stack) {
        return new XrFrameEndInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFrameEndInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameEndInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFrameEndInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFrameEndInfo.NEXT); }
    /** Unsafe version of {@link #displayTime}. */
    public static long ndisplayTime(long struct) { return memGetLong(struct + XrFrameEndInfo.DISPLAYTIME); }
    /** Unsafe version of {@link #environmentBlendMode}. */
    public static int nenvironmentBlendMode(long struct) { return memGetInt(struct + XrFrameEndInfo.ENVIRONMENTBLENDMODE); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return memGetInt(struct + XrFrameEndInfo.LAYERCOUNT); }
    /** Unsafe version of {@link #layers() layers}. */
    public static @Nullable PointerBuffer nlayers(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrFrameEndInfo.LAYERS), nlayerCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFrameEndInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFrameEndInfo.NEXT, value); }
    /** Unsafe version of {@link #displayTime(long) displayTime}. */
    public static void ndisplayTime(long struct, long value) { memPutLong(struct + XrFrameEndInfo.DISPLAYTIME, value); }
    /** Unsafe version of {@link #environmentBlendMode(int) environmentBlendMode}. */
    public static void nenvironmentBlendMode(long struct, int value) { memPutInt(struct + XrFrameEndInfo.ENVIRONMENTBLENDMODE, value); }
    /** Sets the specified value to the {@code layerCount} field of the specified {@code struct}. */
    public static void nlayerCount(long struct, int value) { memPutInt(struct + XrFrameEndInfo.LAYERCOUNT, value); }
    /** Unsafe version of {@link #layers(PointerBuffer) layers}. */
    public static void nlayers(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrFrameEndInfo.LAYERS, memAddressSafe(value)); if (value != null) { nlayerCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrFrameEndInfo} structs. */
    public static class Buffer extends StructBuffer<XrFrameEndInfo, Buffer> implements NativeResource {

        private static final XrFrameEndInfo ELEMENT_FACTORY = XrFrameEndInfo.create(-1L);

        /**
         * Creates a new {@code XrFrameEndInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFrameEndInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrFrameEndInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFrameEndInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFrameEndInfo.nnext(address()); }
        /** @return the value of the {@code displayTime} field. */
        @NativeType("XrTime")
        public long displayTime() { return XrFrameEndInfo.ndisplayTime(address()); }
        /** @return the value of the {@code environmentBlendMode} field. */
        @NativeType("XrEnvironmentBlendMode")
        public int environmentBlendMode() { return XrFrameEndInfo.nenvironmentBlendMode(address()); }
        /** @return the value of the {@code layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return XrFrameEndInfo.nlayerCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code layers} field. */
        @NativeType("XrCompositionLayerBaseHeader const * const *")
        public @Nullable PointerBuffer layers() { return XrFrameEndInfo.nlayers(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFrameEndInfo.Buffer type(@NativeType("XrStructureType") int value) { XrFrameEndInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_FRAME_END_INFO TYPE_FRAME_END_INFO} value to the {@code type} field. */
        public XrFrameEndInfo.Buffer type$Default() { return type(XR10.XR_TYPE_FRAME_END_INFO); }
        /** Sets the specified value to the {@code next} field. */
        public XrFrameEndInfo.Buffer next(@NativeType("void const *") long value) { XrFrameEndInfo.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrFrameEndInfoML} value to the {@code next} chain. */
        public XrFrameEndInfo.Buffer next(XrFrameEndInfoML value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrGlobalDimmerFrameEndInfoML} value to the {@code next} chain. */
        public XrFrameEndInfo.Buffer next(XrGlobalDimmerFrameEndInfoML value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrLocalDimmingFrameEndInfoMETA} value to the {@code next} chain. */
        public XrFrameEndInfo.Buffer next(XrLocalDimmingFrameEndInfoMETA value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSecondaryViewConfigurationFrameEndInfoMSFT} value to the {@code next} chain. */
        public XrFrameEndInfo.Buffer next(XrSecondaryViewConfigurationFrameEndInfoMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code displayTime} field. */
        public XrFrameEndInfo.Buffer displayTime(@NativeType("XrTime") long value) { XrFrameEndInfo.ndisplayTime(address(), value); return this; }
        /** Sets the specified value to the {@code environmentBlendMode} field. */
        public XrFrameEndInfo.Buffer environmentBlendMode(@NativeType("XrEnvironmentBlendMode") int value) { XrFrameEndInfo.nenvironmentBlendMode(address(), value); return this; }
        /** Sets the specified value to the {@code layerCount} field. */
        public XrFrameEndInfo.Buffer layerCount(@NativeType("uint32_t") int value) { XrFrameEndInfo.nlayerCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code layers} field. */
        public XrFrameEndInfo.Buffer layers(@Nullable @NativeType("XrCompositionLayerBaseHeader const * const *") PointerBuffer value) { XrFrameEndInfo.nlayers(address(), value); return this; }

    }

}