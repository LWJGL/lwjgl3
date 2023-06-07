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
 * Stub description of VkDescriptorSetLayoutHostMappingInfoVALVE.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VALVEDescriptorSetHostMapping#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VALVEDescriptorSetHostMapping#vkGetDescriptorSetLayoutHostMappingInfoVALVE GetDescriptorSetLayoutHostMappingInfoVALVE}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetLayoutHostMappingInfoVALVE {
 *     VkStructureType sType;
 *     void * pNext;
 *     size_t descriptorOffset;
 *     uint32_t descriptorSize;
 * }</code></pre>
 */
public class VkDescriptorSetLayoutHostMappingInfoVALVE extends Struct<VkDescriptorSetLayoutHostMappingInfoVALVE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTOROFFSET,
        DESCRIPTORSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTOROFFSET = layout.offsetof(2);
        DESCRIPTORSIZE = layout.offsetof(3);
    }

    protected VkDescriptorSetLayoutHostMappingInfoVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorSetLayoutHostMappingInfoVALVE create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorSetLayoutHostMappingInfoVALVE(address, container);
    }

    /**
     * Creates a {@code VkDescriptorSetLayoutHostMappingInfoVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutHostMappingInfoVALVE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code descriptorOffset} field. */
    @NativeType("size_t")
    public long descriptorOffset() { return ndescriptorOffset(address()); }
    /** @return the value of the {@code descriptorSize} field. */
    @NativeType("uint32_t")
    public int descriptorSize() { return ndescriptorSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorSetLayoutHostMappingInfoVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VALVEDescriptorSetHostMapping#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE} value to the {@code sType} field. */
    public VkDescriptorSetLayoutHostMappingInfoVALVE sType$Default() { return sType(VALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorSetLayoutHostMappingInfoVALVE pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorOffset} field. */
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorOffset(@NativeType("size_t") long value) { ndescriptorOffset(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorSize} field. */
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorSize(@NativeType("uint32_t") int value) { ndescriptorSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetLayoutHostMappingInfoVALVE set(
        int sType,
        long pNext,
        long descriptorOffset,
        int descriptorSize
    ) {
        sType(sType);
        pNext(pNext);
        descriptorOffset(descriptorOffset);
        descriptorSize(descriptorSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetLayoutHostMappingInfoVALVE set(VkDescriptorSetLayoutHostMappingInfoVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetLayoutHostMappingInfoVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE malloc() {
        return new VkDescriptorSetLayoutHostMappingInfoVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetLayoutHostMappingInfoVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE calloc() {
        return new VkDescriptorSetLayoutHostMappingInfoVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetLayoutHostMappingInfoVALVE} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetLayoutHostMappingInfoVALVE(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetLayoutHostMappingInfoVALVE} instance for the specified memory address. */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE create(long address) {
        return new VkDescriptorSetLayoutHostMappingInfoVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutHostMappingInfoVALVE createSafe(long address) {
        return address == NULL ? null : new VkDescriptorSetLayoutHostMappingInfoVALVE(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutHostMappingInfoVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE malloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutHostMappingInfoVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutHostMappingInfoVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE calloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutHostMappingInfoVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetLayoutHostMappingInfoVALVE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetLayoutHostMappingInfoVALVE.PNEXT); }
    /** Unsafe version of {@link #descriptorOffset}. */
    public static long ndescriptorOffset(long struct) { return memGetAddress(struct + VkDescriptorSetLayoutHostMappingInfoVALVE.DESCRIPTOROFFSET); }
    /** Unsafe version of {@link #descriptorSize}. */
    public static int ndescriptorSize(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetLayoutHostMappingInfoVALVE.DESCRIPTORSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetLayoutHostMappingInfoVALVE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetLayoutHostMappingInfoVALVE.PNEXT, value); }
    /** Unsafe version of {@link #descriptorOffset(long) descriptorOffset}. */
    public static void ndescriptorOffset(long struct, long value) { memPutAddress(struct + VkDescriptorSetLayoutHostMappingInfoVALVE.DESCRIPTOROFFSET, value); }
    /** Unsafe version of {@link #descriptorSize(int) descriptorSize}. */
    public static void ndescriptorSize(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetLayoutHostMappingInfoVALVE.DESCRIPTORSIZE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetLayoutHostMappingInfoVALVE} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutHostMappingInfoVALVE, Buffer> implements NativeResource {

        private static final VkDescriptorSetLayoutHostMappingInfoVALVE ELEMENT_FACTORY = VkDescriptorSetLayoutHostMappingInfoVALVE.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutHostMappingInfoVALVE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorSetLayoutHostMappingInfoVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetLayoutHostMappingInfoVALVE.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDescriptorSetLayoutHostMappingInfoVALVE.npNext(address()); }
        /** @return the value of the {@code descriptorOffset} field. */
        @NativeType("size_t")
        public long descriptorOffset() { return VkDescriptorSetLayoutHostMappingInfoVALVE.ndescriptorOffset(address()); }
        /** @return the value of the {@code descriptorSize} field. */
        @NativeType("uint32_t")
        public int descriptorSize() { return VkDescriptorSetLayoutHostMappingInfoVALVE.ndescriptorSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetLayoutHostMappingInfoVALVE.nsType(address(), value); return this; }
        /** Sets the {@link VALVEDescriptorSetHostMapping#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE} value to the {@code sType} field. */
        public VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer sType$Default() { return sType(VALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer pNext(@NativeType("void *") long value) { VkDescriptorSetLayoutHostMappingInfoVALVE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorOffset} field. */
        public VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer descriptorOffset(@NativeType("size_t") long value) { VkDescriptorSetLayoutHostMappingInfoVALVE.ndescriptorOffset(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorSize} field. */
        public VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer descriptorSize(@NativeType("uint32_t") int value) { VkDescriptorSetLayoutHostMappingInfoVALVE.ndescriptorSize(address(), value); return this; }

    }

}