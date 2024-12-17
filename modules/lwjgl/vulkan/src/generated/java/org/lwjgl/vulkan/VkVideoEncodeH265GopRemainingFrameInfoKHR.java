/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkVideoEncodeH265GopRemainingFrameInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 useGopRemainingFrames;
 *     uint32_t gopRemainingI;
 *     uint32_t gopRemainingP;
 *     uint32_t gopRemainingB;
 * }}</pre>
 */
public class VkVideoEncodeH265GopRemainingFrameInfoKHR extends Struct<VkVideoEncodeH265GopRemainingFrameInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        USEGOPREMAININGFRAMES,
        GOPREMAININGI,
        GOPREMAININGP,
        GOPREMAININGB;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEGOPREMAININGFRAMES = layout.offsetof(2);
        GOPREMAININGI = layout.offsetof(3);
        GOPREMAININGP = layout.offsetof(4);
        GOPREMAININGB = layout.offsetof(5);
    }

    protected VkVideoEncodeH265GopRemainingFrameInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265GopRemainingFrameInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265GopRemainingFrameInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265GopRemainingFrameInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code useGopRemainingFrames} field. */
    @NativeType("VkBool32")
    public boolean useGopRemainingFrames() { return nuseGopRemainingFrames(address()) != 0; }
    /** @return the value of the {@code gopRemainingI} field. */
    @NativeType("uint32_t")
    public int gopRemainingI() { return ngopRemainingI(address()); }
    /** @return the value of the {@code gopRemainingP} field. */
    @NativeType("uint32_t")
    public int gopRemainingP() { return ngopRemainingP(address()); }
    /** @return the value of the {@code gopRemainingB} field. */
    @NativeType("uint32_t")
    public int gopRemainingB() { return ngopRemainingB(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code useGopRemainingFrames} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoKHR useGopRemainingFrames(@NativeType("VkBool32") boolean value) { nuseGopRemainingFrames(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code gopRemainingI} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingI(@NativeType("uint32_t") int value) { ngopRemainingI(address(), value); return this; }
    /** Sets the specified value to the {@code gopRemainingP} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingP(@NativeType("uint32_t") int value) { ngopRemainingP(address(), value); return this; }
    /** Sets the specified value to the {@code gopRemainingB} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingB(@NativeType("uint32_t") int value) { ngopRemainingB(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265GopRemainingFrameInfoKHR set(
        int sType,
        long pNext,
        boolean useGopRemainingFrames,
        int gopRemainingI,
        int gopRemainingP,
        int gopRemainingB
    ) {
        sType(sType);
        pNext(pNext);
        useGopRemainingFrames(useGopRemainingFrames);
        gopRemainingI(gopRemainingI);
        gopRemainingP(gopRemainingP);
        gopRemainingB(gopRemainingB);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265GopRemainingFrameInfoKHR set(VkVideoEncodeH265GopRemainingFrameInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR malloc() {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR calloc() {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR create(long address) {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265GopRemainingFrameInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265GopRemainingFrameInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.PNEXT); }
    /** Unsafe version of {@link #useGopRemainingFrames}. */
    public static int nuseGopRemainingFrames(long struct) { return memGetInt(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.USEGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #gopRemainingI}. */
    public static int ngopRemainingI(long struct) { return memGetInt(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.GOPREMAININGI); }
    /** Unsafe version of {@link #gopRemainingP}. */
    public static int ngopRemainingP(long struct) { return memGetInt(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.GOPREMAININGP); }
    /** Unsafe version of {@link #gopRemainingB}. */
    public static int ngopRemainingB(long struct) { return memGetInt(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.GOPREMAININGB); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #useGopRemainingFrames(boolean) useGopRemainingFrames}. */
    public static void nuseGopRemainingFrames(long struct, int value) { memPutInt(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.USEGOPREMAININGFRAMES, value); }
    /** Unsafe version of {@link #gopRemainingI(int) gopRemainingI}. */
    public static void ngopRemainingI(long struct, int value) { memPutInt(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.GOPREMAININGI, value); }
    /** Unsafe version of {@link #gopRemainingP(int) gopRemainingP}. */
    public static void ngopRemainingP(long struct, int value) { memPutInt(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.GOPREMAININGP, value); }
    /** Unsafe version of {@link #gopRemainingB(int) gopRemainingB}. */
    public static void ngopRemainingB(long struct, int value) { memPutInt(struct + VkVideoEncodeH265GopRemainingFrameInfoKHR.GOPREMAININGB, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265GopRemainingFrameInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265GopRemainingFrameInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265GopRemainingFrameInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265GopRemainingFrameInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265GopRemainingFrameInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265GopRemainingFrameInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.npNext(address()); }
        /** @return the value of the {@code useGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean useGopRemainingFrames() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.nuseGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@code gopRemainingI} field. */
        @NativeType("uint32_t")
        public int gopRemainingI() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingI(address()); }
        /** @return the value of the {@code gopRemainingP} field. */
        @NativeType("uint32_t")
        public int gopRemainingP() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingP(address()); }
        /** @return the value of the {@code gopRemainingB} field. */
        @NativeType("uint32_t")
        public int gopRemainingB() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingB(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code useGopRemainingFrames} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer useGopRemainingFrames(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.nuseGopRemainingFrames(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code gopRemainingI} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer gopRemainingI(@NativeType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingI(address(), value); return this; }
        /** Sets the specified value to the {@code gopRemainingP} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer gopRemainingP(@NativeType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingP(address(), value); return this; }
        /** Sets the specified value to the {@code gopRemainingB} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer gopRemainingB(@NativeType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingB(address(), value); return this; }

    }

}