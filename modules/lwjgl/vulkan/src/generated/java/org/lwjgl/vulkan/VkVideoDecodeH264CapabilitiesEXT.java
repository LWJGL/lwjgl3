/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying H.264 decode capabilities.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_EXT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtensionProperties}, {@link VkOffset2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264CapabilitiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxLevel};
 *     {@link VkOffset2D VkOffset2D} {@link #fieldOffsetGranularity};
 *     {@link VkExtensionProperties VkExtensionProperties} {@link #stdExtensionVersion};
 * }</code></pre>
 */
public class VkVideoDecodeH264CapabilitiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXLEVEL,
        FIELDOFFSETGRANULARITY,
        STDEXTENSIONVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
            __member(VkExtensionProperties.SIZEOF, VkExtensionProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXLEVEL = layout.offsetof(2);
        FIELDOFFSETGRANULARITY = layout.offsetof(3);
        STDEXTENSIONVERSION = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkVideoDecodeH264CapabilitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264CapabilitiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the maximum H.264 level supported by the device. */
    @NativeType("uint32_t")
    public int maxLevel() { return nmaxLevel(address()); }
    /** - if Interlaced Video Content is suported, the maximum field offset granularity supported for the picture resource. */
    public VkOffset2D fieldOffsetGranularity() { return nfieldOffsetGranularity(address()); }
    /** a {@link VkExtensionProperties} structure specifying the H.264 extension name and version supported by this implementation. */
    public VkExtensionProperties stdExtensionVersion() { return nstdExtensionVersion(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH264CapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_EXT} value to the {@link #sType} field. */
    public VkVideoDecodeH264CapabilitiesEXT sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH264CapabilitiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264CapabilitiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeH264CapabilitiesEXT set(VkVideoDecodeH264CapabilitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264CapabilitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264CapabilitiesEXT malloc() {
        return wrap(VkVideoDecodeH264CapabilitiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264CapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264CapabilitiesEXT calloc() {
        return wrap(VkVideoDecodeH264CapabilitiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264CapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264CapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeH264CapabilitiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264CapabilitiesEXT} instance for the specified memory address. */
    public static VkVideoDecodeH264CapabilitiesEXT create(long address) {
        return wrap(VkVideoDecodeH264CapabilitiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264CapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeH264CapabilitiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264CapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeH264CapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264CapabilitiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264CapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264CapabilitiesEXT malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264CapabilitiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeH264CapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264CapabilitiesEXT calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264CapabilitiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeH264CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264CapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264CapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxLevel}. */
    public static int nmaxLevel(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264CapabilitiesEXT.MAXLEVEL); }
    /** Unsafe version of {@link #fieldOffsetGranularity}. */
    public static VkOffset2D nfieldOffsetGranularity(long struct) { return VkOffset2D.create(struct + VkVideoDecodeH264CapabilitiesEXT.FIELDOFFSETGRANULARITY); }
    /** Unsafe version of {@link #stdExtensionVersion}. */
    public static VkExtensionProperties nstdExtensionVersion(long struct) { return VkExtensionProperties.create(struct + VkVideoDecodeH264CapabilitiesEXT.STDEXTENSIONVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264CapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264CapabilitiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264CapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264CapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264CapabilitiesEXT ELEMENT_FACTORY = VkVideoDecodeH264CapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264CapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264CapabilitiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeH264CapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264CapabilitiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264CapabilitiesEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH264CapabilitiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoDecodeH264CapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeH264CapabilitiesEXT#maxLevel} field. */
        @NativeType("uint32_t")
        public int maxLevel() { return VkVideoDecodeH264CapabilitiesEXT.nmaxLevel(address()); }
        /** @return a {@link VkOffset2D} view of the {@link VkVideoDecodeH264CapabilitiesEXT#fieldOffsetGranularity} field. */
        public VkOffset2D fieldOffsetGranularity() { return VkVideoDecodeH264CapabilitiesEXT.nfieldOffsetGranularity(address()); }
        /** @return a {@link VkExtensionProperties} view of the {@link VkVideoDecodeH264CapabilitiesEXT#stdExtensionVersion} field. */
        public VkExtensionProperties stdExtensionVersion() { return VkVideoDecodeH264CapabilitiesEXT.nstdExtensionVersion(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264CapabilitiesEXT#sType} field. */
        public VkVideoDecodeH264CapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264CapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_EXT} value to the {@link VkVideoDecodeH264CapabilitiesEXT#sType} field. */
        public VkVideoDecodeH264CapabilitiesEXT.Buffer sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_EXT); }
        /** Sets the specified value to the {@link VkVideoDecodeH264CapabilitiesEXT#pNext} field. */
        public VkVideoDecodeH264CapabilitiesEXT.Buffer pNext(@NativeType("void *") long value) { VkVideoDecodeH264CapabilitiesEXT.npNext(address(), value); return this; }

    }

}