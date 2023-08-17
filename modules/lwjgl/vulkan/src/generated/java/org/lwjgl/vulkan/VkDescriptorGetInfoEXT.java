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
 * Structure specifying parameters of descriptor to get.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> not be {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} or {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, the {@code pCombinedImageSampler→sampler} member of {@code data} <b>must</b> be a {@code VkSampler} created on {@code device}</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, the {@code pCombinedImageSampler→imageView} member of {@code data} <b>must</b> be a {@code VkImageView} created on {@code device}, or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, the {@code pInputAttachmentImage→imageView} member of {@code data} <b>must</b> be a {@code VkImageView} created on {@code device}</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, and if {@code pSampledImage} is not {@code NULL}, the {@code pSampledImage→imageView} member of {@code data} <b>must</b> be a {@code VkImageView} created on {@code device}, or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, and if {@code pStorageImage} is not {@code NULL}, the {@code pStorageImage→imageView} member of {@code data} <b>must</b> be a {@code VkImageView} created on {@code device}, or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}, {@code pUniformTexelBuffer} is not {@code NULL} and {@code pUniformTexelBuffer→address} is not zero, {@code pUniformTexelBuffer→address} must be an address within a {@code VkBuffer} created on {@code device}</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}, {@code pStorageTexelBuffer} is not {@code NULL} and {@code pStorageTexelBuffer→address} is not zero, {@code pStorageTexelBuffer→address} must be an address within a {@code VkBuffer} created on {@code device}</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}, {@code pUniformBuffer} is not {@code NULL} and {@code pUniformBuffer→address} is not zero, {@code pUniformBuffer→address} must be an address within a {@code VkBuffer} created on {@code device}</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}, {@code pStorageBuffer} is not {@code NULL} and {@code pStorageBuffer→address} is not zero, {@code pStorageBuffer→address} must be an address within a {@code VkBuffer} created on {@code device}</li>
 * <li>If {@code type} is {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} and {@code accelerationStructure} is not 0, {@code accelerationStructure} <b>must</b> contain the address of a {@code VkAccelerationStructureKHR} created on {@code device}</li>
 * <li>If {@code type} is {@link NVRayTracing#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV} and {@code accelerationStructure} is not 0, {@code accelerationStructure} <b>must</b> contain the handle of a {@code VkAccelerationStructureNV} created on {@code device}, returned by {@link NVRayTracing#vkGetAccelerationStructureHandleNV GetAccelerationStructureHandleNV}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkDescriptorType} value</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, the {@code pSampler} member of {@code data} <b>must</b> be a valid pointer to a valid {@code VkSampler} handle</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, the {@code pCombinedImageSampler} member of {@code data} <b>must</b> be a valid pointer to a valid {@link VkDescriptorImageInfo} structure</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, the {@code pInputAttachmentImage} member of {@code data} <b>must</b> be a valid pointer to a valid {@link VkDescriptorImageInfo} structure</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, and if {@code pSampledImage} is not {@code NULL}, the {@code pSampledImage} member of {@code data} <b>must</b> be a valid pointer to a valid {@link VkDescriptorImageInfo} structure</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, and if {@code pStorageImage} is not {@code NULL}, the {@code pStorageImage} member of {@code data} <b>must</b> be a valid pointer to a valid {@link VkDescriptorImageInfo} structure</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}, and if {@code pUniformTexelBuffer} is not {@code NULL}, the {@code pUniformTexelBuffer} member of {@code data} <b>must</b> be a valid pointer to a valid {@link VkDescriptorAddressInfoEXT} structure</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}, and if {@code pStorageTexelBuffer} is not {@code NULL}, the {@code pStorageTexelBuffer} member of {@code data} <b>must</b> be a valid pointer to a valid {@link VkDescriptorAddressInfoEXT} structure</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}, and if {@code pUniformBuffer} is not {@code NULL}, the {@code pUniformBuffer} member of {@code data} <b>must</b> be a valid pointer to a valid {@link VkDescriptorAddressInfoEXT} structure</li>
 * <li>If {@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}, and if {@code pStorageBuffer} is not {@code NULL}, the {@code pStorageBuffer} member of {@code data} <b>must</b> be a valid pointer to a valid {@link VkDescriptorAddressInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorDataEXT}, {@link EXTDescriptorBuffer#vkGetDescriptorEXT GetDescriptorEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorGetInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDescriptorType {@link #type};
 *     {@link VkDescriptorDataEXT VkDescriptorDataEXT} {@link #data};
 * }</code></pre>
 */
public class VkDescriptorGetInfoEXT extends Struct<VkDescriptorGetInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkDescriptorDataEXT.SIZEOF, VkDescriptorDataEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        DATA = layout.offsetof(3);
    }

    protected VkDescriptorGetInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorGetInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorGetInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorGetInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorGetInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the type of descriptor to get. */
    @NativeType("VkDescriptorType")
    public int type() { return ntype(address()); }
    /** a structure containing the information needed to get the descriptor. */
    public VkDescriptorDataEXT data() { return ndata(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDescriptorGetInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT} value to the {@link #sType} field. */
    public VkDescriptorGetInfoEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDescriptorGetInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkDescriptorGetInfoEXT type(@NativeType("VkDescriptorType") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link VkDescriptorDataEXT} to the {@link #data} field. */
    public VkDescriptorGetInfoEXT data(VkDescriptorDataEXT value) { ndata(address(), value); return this; }
    /** Passes the {@link #data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDescriptorGetInfoEXT data(java.util.function.Consumer<VkDescriptorDataEXT> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorGetInfoEXT set(
        int sType,
        long pNext,
        int type,
        VkDescriptorDataEXT data
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorGetInfoEXT set(VkDescriptorGetInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorGetInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorGetInfoEXT malloc() {
        return new VkDescriptorGetInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorGetInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorGetInfoEXT calloc() {
        return new VkDescriptorGetInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorGetInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorGetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorGetInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorGetInfoEXT} instance for the specified memory address. */
    public static VkDescriptorGetInfoEXT create(long address) {
        return new VkDescriptorGetInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorGetInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorGetInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorGetInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorGetInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorGetInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorGetInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorGetInfoEXT malloc(MemoryStack stack) {
        return new VkDescriptorGetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorGetInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorGetInfoEXT calloc(MemoryStack stack) {
        return new VkDescriptorGetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorGetInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorGetInfoEXT.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorGetInfoEXT.TYPE); }
    /** Unsafe version of {@link #data}. */
    public static VkDescriptorDataEXT ndata(long struct) { return VkDescriptorDataEXT.create(struct + VkDescriptorGetInfoEXT.DATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorGetInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorGetInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorGetInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #data(VkDescriptorDataEXT) data}. */
    public static void ndata(long struct, VkDescriptorDataEXT value) { memCopy(value.address(), struct + VkDescriptorGetInfoEXT.DATA, VkDescriptorDataEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkDescriptorGetInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorGetInfoEXT, Buffer> implements NativeResource {

        private static final VkDescriptorGetInfoEXT ELEMENT_FACTORY = VkDescriptorGetInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorGetInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorGetInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorGetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorGetInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorGetInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDescriptorGetInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorGetInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDescriptorGetInfoEXT#type} field. */
        @NativeType("VkDescriptorType")
        public int type() { return VkDescriptorGetInfoEXT.ntype(address()); }
        /** @return a {@link VkDescriptorDataEXT} view of the {@link VkDescriptorGetInfoEXT#data} field. */
        public VkDescriptorDataEXT data() { return VkDescriptorGetInfoEXT.ndata(address()); }

        /** Sets the specified value to the {@link VkDescriptorGetInfoEXT#sType} field. */
        public VkDescriptorGetInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorGetInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT} value to the {@link VkDescriptorGetInfoEXT#sType} field. */
        public VkDescriptorGetInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT); }
        /** Sets the specified value to the {@link VkDescriptorGetInfoEXT#pNext} field. */
        public VkDescriptorGetInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorGetInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorGetInfoEXT#type} field. */
        public VkDescriptorGetInfoEXT.Buffer type(@NativeType("VkDescriptorType") int value) { VkDescriptorGetInfoEXT.ntype(address(), value); return this; }
        /** Copies the specified {@link VkDescriptorDataEXT} to the {@link VkDescriptorGetInfoEXT#data} field. */
        public VkDescriptorGetInfoEXT.Buffer data(VkDescriptorDataEXT value) { VkDescriptorGetInfoEXT.ndata(address(), value); return this; }
        /** Passes the {@link VkDescriptorGetInfoEXT#data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDescriptorGetInfoEXT.Buffer data(java.util.function.Consumer<VkDescriptorDataEXT> consumer) { consumer.accept(data()); return this; }

    }

}