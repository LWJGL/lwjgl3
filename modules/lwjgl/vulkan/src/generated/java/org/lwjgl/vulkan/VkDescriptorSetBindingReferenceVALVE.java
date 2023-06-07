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
 * Stub description of VkDescriptorSetBindingReferenceVALVE.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VALVEDescriptorSetHostMapping#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code descriptorSetLayout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VALVEDescriptorSetHostMapping#vkGetDescriptorSetLayoutHostMappingInfoVALVE GetDescriptorSetLayoutHostMappingInfoVALVE}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetBindingReferenceVALVE {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDescriptorSetLayout descriptorSetLayout;
 *     uint32_t binding;
 * }</code></pre>
 */
public class VkDescriptorSetBindingReferenceVALVE extends Struct<VkDescriptorSetBindingReferenceVALVE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORSETLAYOUT,
        BINDING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORSETLAYOUT = layout.offsetof(2);
        BINDING = layout.offsetof(3);
    }

    protected VkDescriptorSetBindingReferenceVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorSetBindingReferenceVALVE create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorSetBindingReferenceVALVE(address, container);
    }

    /**
     * Creates a {@code VkDescriptorSetBindingReferenceVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetBindingReferenceVALVE(ByteBuffer container) {
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
    /** @return the value of the {@code descriptorSetLayout} field. */
    @NativeType("VkDescriptorSetLayout")
    public long descriptorSetLayout() { return ndescriptorSetLayout(address()); }
    /** @return the value of the {@code binding} field. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorSetBindingReferenceVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VALVEDescriptorSetHostMapping#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE} value to the {@code sType} field. */
    public VkDescriptorSetBindingReferenceVALVE sType$Default() { return sType(VALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorSetBindingReferenceVALVE pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorSetLayout} field. */
    public VkDescriptorSetBindingReferenceVALVE descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) { ndescriptorSetLayout(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public VkDescriptorSetBindingReferenceVALVE binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetBindingReferenceVALVE set(
        int sType,
        long pNext,
        long descriptorSetLayout,
        int binding
    ) {
        sType(sType);
        pNext(pNext);
        descriptorSetLayout(descriptorSetLayout);
        binding(binding);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetBindingReferenceVALVE set(VkDescriptorSetBindingReferenceVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetBindingReferenceVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetBindingReferenceVALVE malloc() {
        return new VkDescriptorSetBindingReferenceVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetBindingReferenceVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetBindingReferenceVALVE calloc() {
        return new VkDescriptorSetBindingReferenceVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetBindingReferenceVALVE} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetBindingReferenceVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetBindingReferenceVALVE(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetBindingReferenceVALVE} instance for the specified memory address. */
    public static VkDescriptorSetBindingReferenceVALVE create(long address) {
        return new VkDescriptorSetBindingReferenceVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetBindingReferenceVALVE createSafe(long address) {
        return address == NULL ? null : new VkDescriptorSetBindingReferenceVALVE(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorSetBindingReferenceVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetBindingReferenceVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetBindingReferenceVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetBindingReferenceVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetBindingReferenceVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetBindingReferenceVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorSetBindingReferenceVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetBindingReferenceVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetBindingReferenceVALVE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorSetBindingReferenceVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetBindingReferenceVALVE malloc(MemoryStack stack) {
        return new VkDescriptorSetBindingReferenceVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorSetBindingReferenceVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetBindingReferenceVALVE calloc(MemoryStack stack) {
        return new VkDescriptorSetBindingReferenceVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorSetBindingReferenceVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetBindingReferenceVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetBindingReferenceVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetBindingReferenceVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetBindingReferenceVALVE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetBindingReferenceVALVE.PNEXT); }
    /** Unsafe version of {@link #descriptorSetLayout}. */
    public static long ndescriptorSetLayout(long struct) { return UNSAFE.getLong(null, struct + VkDescriptorSetBindingReferenceVALVE.DESCRIPTORSETLAYOUT); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetBindingReferenceVALVE.BINDING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetBindingReferenceVALVE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetBindingReferenceVALVE.PNEXT, value); }
    /** Unsafe version of {@link #descriptorSetLayout(long) descriptorSetLayout}. */
    public static void ndescriptorSetLayout(long struct, long value) { UNSAFE.putLong(null, struct + VkDescriptorSetBindingReferenceVALVE.DESCRIPTORSETLAYOUT, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetBindingReferenceVALVE.BINDING, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetBindingReferenceVALVE} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetBindingReferenceVALVE, Buffer> implements NativeResource {

        private static final VkDescriptorSetBindingReferenceVALVE ELEMENT_FACTORY = VkDescriptorSetBindingReferenceVALVE.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetBindingReferenceVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetBindingReferenceVALVE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorSetBindingReferenceVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetBindingReferenceVALVE.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorSetBindingReferenceVALVE.npNext(address()); }
        /** @return the value of the {@code descriptorSetLayout} field. */
        @NativeType("VkDescriptorSetLayout")
        public long descriptorSetLayout() { return VkDescriptorSetBindingReferenceVALVE.ndescriptorSetLayout(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkDescriptorSetBindingReferenceVALVE.nbinding(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorSetBindingReferenceVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetBindingReferenceVALVE.nsType(address(), value); return this; }
        /** Sets the {@link VALVEDescriptorSetHostMapping#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE} value to the {@code sType} field. */
        public VkDescriptorSetBindingReferenceVALVE.Buffer sType$Default() { return sType(VALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorSetBindingReferenceVALVE.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorSetBindingReferenceVALVE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorSetLayout} field. */
        public VkDescriptorSetBindingReferenceVALVE.Buffer descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) { VkDescriptorSetBindingReferenceVALVE.ndescriptorSetLayout(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public VkDescriptorSetBindingReferenceVALVE.Buffer binding(@NativeType("uint32_t") int value) { VkDescriptorSetBindingReferenceVALVE.nbinding(address(), value); return this; }

    }

}