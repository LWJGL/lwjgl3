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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Acceleration structure version information.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>{@code pVersionData} is a <em>pointer</em> to an array of 2*{@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values instead of two {@link VK10#VK_UUID_SIZE UUID_SIZE} arrays as the expected use case for this member is to be pointed at the header of an previously serialized acceleration structure (via {@link KHRAccelerationStructure#vkCmdCopyAccelerationStructureToMemoryKHR CmdCopyAccelerationStructureToMemoryKHR} or {@link KHRAccelerationStructure#vkCopyAccelerationStructureToMemoryKHR CopyAccelerationStructureToMemoryKHR}) that is loaded in memory. Using arrays would necessitate extra memory copies of the UUIDs.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pVersionData} <b>must</b> be a valid pointer to an array of 2 &times; {@code VK_UUID_SIZE} {@code uint8_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRAccelerationStructure#vkGetDeviceAccelerationStructureCompatibilityKHR GetDeviceAccelerationStructureCompatibilityKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureVersionInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint8_t const * {@link #pVersionData};
 * }</code></pre>
 */
public class VkAccelerationStructureVersionInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PVERSIONDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PVERSIONDATA = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkAccelerationStructureVersionInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureVersionInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return a pointer to the version header of an acceleration structure as defined in {@link KHRAccelerationStructure#vkCmdCopyAccelerationStructureToMemoryKHR CmdCopyAccelerationStructureToMemoryKHR}
     */
    @NativeType("uint8_t const *")
    public ByteBuffer pVersionData(int capacity) { return npVersionData(address(), capacity); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureVersionInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR} value to the {@link #sType} field. */
    public VkAccelerationStructureVersionInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureVersionInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pVersionData} field. */
    public VkAccelerationStructureVersionInfoKHR pVersionData(@NativeType("uint8_t const *") ByteBuffer value) { npVersionData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureVersionInfoKHR set(
        int sType,
        long pNext,
        ByteBuffer pVersionData
    ) {
        sType(sType);
        pNext(pNext);
        pVersionData(pVersionData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureVersionInfoKHR set(VkAccelerationStructureVersionInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureVersionInfoKHR malloc() {
        return wrap(VkAccelerationStructureVersionInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureVersionInfoKHR calloc() {
        return wrap(VkAccelerationStructureVersionInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureVersionInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureVersionInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance for the specified memory address. */
    public static VkAccelerationStructureVersionInfoKHR create(long address) {
        return wrap(VkAccelerationStructureVersionInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureVersionInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureVersionInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureVersionInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureVersionInfoKHR malloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureVersionInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureVersionInfoKHR calloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureVersionInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureVersionInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureVersionInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pVersionData(int) pVersionData}. */
    public static ByteBuffer npVersionData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + VkAccelerationStructureVersionInfoKHR.PVERSIONDATA), capacity); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureVersionInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureVersionInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pVersionData(ByteBuffer) pVersionData}. */
    public static void npVersionData(long struct, ByteBuffer value) { memPutAddress(struct + VkAccelerationStructureVersionInfoKHR.PVERSIONDATA, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkAccelerationStructureVersionInfoKHR.PVERSIONDATA));
    }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureVersionInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureVersionInfoKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureVersionInfoKHR ELEMENT_FACTORY = VkAccelerationStructureVersionInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureVersionInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureVersionInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAccelerationStructureVersionInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureVersionInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureVersionInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureVersionInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureVersionInfoKHR.npNext(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link VkAccelerationStructureVersionInfoKHR#pVersionData} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint8_t const *")
        public ByteBuffer pVersionData(int capacity) { return VkAccelerationStructureVersionInfoKHR.npVersionData(address(), capacity); }

        /** Sets the specified value to the {@link VkAccelerationStructureVersionInfoKHR#sType} field. */
        public VkAccelerationStructureVersionInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureVersionInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR} value to the {@link VkAccelerationStructureVersionInfoKHR#sType} field. */
        public VkAccelerationStructureVersionInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR); }
        /** Sets the specified value to the {@link VkAccelerationStructureVersionInfoKHR#pNext} field. */
        public VkAccelerationStructureVersionInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureVersionInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkAccelerationStructureVersionInfoKHR#pVersionData} field. */
        public VkAccelerationStructureVersionInfoKHR.Buffer pVersionData(@NativeType("uint8_t const *") ByteBuffer value) { VkAccelerationStructureVersionInfoKHR.npVersionData(address(), value); return this; }

    }

}