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
 * Structure specifying an acceleration structure for descriptor capture.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code accelerationStructure} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} then {@code accelerationStructure} <b>must</b> have been created with {@link EXTDescriptorBuffer#VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT} set in {@link VkAccelerationStructureCreateInfoKHR}{@code ::createFlags}</li>
 * <li>If {@code accelerationStructureNV} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} then {@code accelerationStructureNV} <b>must</b> have been created with {@link EXTDescriptorBuffer#VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT} set in {@link VkAccelerationStructureCreateInfoNV}{@code ::info.flags}</li>
 * <li>If {@code accelerationStructure} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} then {@code accelerationStructureNV} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code accelerationStructureNV} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} then {@code accelerationStructure} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code accelerationStructure} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
 * <li>If {@code accelerationStructureNV} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code accelerationStructureNV} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
 * <li>Both of {@code accelerationStructure}, and {@code accelerationStructureNV} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDescriptorBuffer#vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT GetAccelerationStructureOpaqueCaptureDescriptorDataEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureCaptureDescriptorDataInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAccelerationStructureKHR {@link #accelerationStructure};
 *     VkAccelerationStructureNV {@link #accelerationStructureNV};
 * }</code></pre>
 */
public class VkAccelerationStructureCaptureDescriptorDataInfoEXT extends Struct<VkAccelerationStructureCaptureDescriptorDataInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACCELERATIONSTRUCTURE,
        ACCELERATIONSTRUCTURENV;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
        ACCELERATIONSTRUCTURENV = layout.offsetof(3);
    }

    protected VkAccelerationStructureCaptureDescriptorDataInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureCaptureDescriptorDataInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureCaptureDescriptorDataInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT(ByteBuffer container) {
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
    /** the {@code VkAccelerationStructureKHR} handle of the acceleration structure to get opaque capture data for. */
    @NativeType("VkAccelerationStructureKHR")
    public long accelerationStructure() { return naccelerationStructure(address()); }
    /** the {@code VkAccelerationStructureNV} handle of the acceleration structure to get opaque capture data for. */
    @NativeType("VkAccelerationStructureNV")
    public long accelerationStructureNV() { return naccelerationStructureNV(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT} value to the {@link #sType} field. */
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #accelerationStructure} field. */
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { naccelerationStructure(address(), value); return this; }
    /** Sets the specified value to the {@link #accelerationStructureNV} field. */
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructureNV(@NativeType("VkAccelerationStructureNV") long value) { naccelerationStructureNV(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT set(
        int sType,
        long pNext,
        long accelerationStructure,
        long accelerationStructureNV
    ) {
        sType(sType);
        pNext(pNext);
        accelerationStructure(accelerationStructure);
        accelerationStructureNV(accelerationStructureNV);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT set(VkAccelerationStructureCaptureDescriptorDataInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureCaptureDescriptorDataInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT malloc() {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureCaptureDescriptorDataInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT calloc() {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureCaptureDescriptorDataInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureCaptureDescriptorDataInfoEXT} instance for the specified memory address. */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT create(long address) {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureCaptureDescriptorDataInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureCaptureDescriptorDataInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT malloc(MemoryStack stack) {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureCaptureDescriptorDataInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT calloc(MemoryStack stack) {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureCaptureDescriptorDataInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureCaptureDescriptorDataInfoEXT.PNEXT); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static long naccelerationStructure(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureCaptureDescriptorDataInfoEXT.ACCELERATIONSTRUCTURE); }
    /** Unsafe version of {@link #accelerationStructureNV}. */
    public static long naccelerationStructureNV(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureCaptureDescriptorDataInfoEXT.ACCELERATIONSTRUCTURENV); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureCaptureDescriptorDataInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureCaptureDescriptorDataInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #accelerationStructure(long) accelerationStructure}. */
    public static void naccelerationStructure(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureCaptureDescriptorDataInfoEXT.ACCELERATIONSTRUCTURE, value); }
    /** Unsafe version of {@link #accelerationStructureNV(long) accelerationStructureNV}. */
    public static void naccelerationStructureNV(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureCaptureDescriptorDataInfoEXT.ACCELERATIONSTRUCTURENV, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureCaptureDescriptorDataInfoEXT, Buffer> implements NativeResource {

        private static final VkAccelerationStructureCaptureDescriptorDataInfoEXT ELEMENT_FACTORY = VkAccelerationStructureCaptureDescriptorDataInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureCaptureDescriptorDataInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT#accelerationStructure} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long accelerationStructure() { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.naccelerationStructure(address()); }
        /** @return the value of the {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT#accelerationStructureNV} field. */
        @NativeType("VkAccelerationStructureNV")
        public long accelerationStructureNV() { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.naccelerationStructureNV(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT#sType} field. */
        public VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT} value to the {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT#sType} field. */
        public VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT); }
        /** Sets the specified value to the {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT#pNext} field. */
        public VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT#accelerationStructure} field. */
        public VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer accelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.naccelerationStructure(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT#accelerationStructureNV} field. */
        public VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer accelerationStructureNV(@NativeType("VkAccelerationStructureNV") long value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.naccelerationStructureNV(address(), value); return this; }

    }

}