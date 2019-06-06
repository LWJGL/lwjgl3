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
 * Structure specifying the parameters of a newly created acceleration structure object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code compactedSize} is not 0 then both {@code info.geometryCount} and {@code info.instanceCount} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code info} <b>must</b> be a valid {@link VkAccelerationStructureInfoNV} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureInfoNV}, {@link NVRayTracing#vkCreateAccelerationStructureNV CreateAccelerationStructureNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code compactedSize} &ndash; the size from the result of {@link NVRayTracing#vkCmdWriteAccelerationStructuresPropertiesNV CmdWriteAccelerationStructuresPropertiesNV} if this acceleration structure is going to be the target of a compacting copy.</li>
 * <li>{@code info} &ndash; the {@link VkAccelerationStructureInfoNV} structure that specifies further parameters of the created acceleration structure.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceSize compactedSize;
 *     {@link VkAccelerationStructureInfoNV VkAccelerationStructureInfoNV} info;
 * }</code></pre>
 */
public class VkAccelerationStructureCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMPACTEDSIZE,
        INFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(VkAccelerationStructureInfoNV.SIZEOF, VkAccelerationStructureInfoNV.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPACTEDSIZE = layout.offsetof(2);
        INFO = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkAccelerationStructureCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code compactedSize} field. */
    @NativeType("VkDeviceSize")
    public long compactedSize() { return ncompactedSize(address()); }
    /** Returns a {@link VkAccelerationStructureInfoNV} view of the {@code info} field. */
    public VkAccelerationStructureInfoNV info() { return ninfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code compactedSize} field. */
    public VkAccelerationStructureCreateInfoNV compactedSize(@NativeType("VkDeviceSize") long value) { ncompactedSize(address(), value); return this; }
    /** Copies the specified {@link VkAccelerationStructureInfoNV} to the {@code info} field. */
    public VkAccelerationStructureCreateInfoNV info(VkAccelerationStructureInfoNV value) { ninfo(address(), value); return this; }
    /** Passes the {@code info} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureCreateInfoNV info(java.util.function.Consumer<VkAccelerationStructureInfoNV> consumer) { consumer.accept(info()); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureCreateInfoNV set(
        int sType,
        long pNext,
        long compactedSize,
        VkAccelerationStructureInfoNV info
    ) {
        sType(sType);
        pNext(pNext);
        compactedSize(compactedSize);
        info(info);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureCreateInfoNV set(VkAccelerationStructureCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCreateInfoNV malloc() {
        return wrap(VkAccelerationStructureCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCreateInfoNV calloc() {
        return wrap(VkAccelerationStructureCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoNV} instance for the specified memory address. */
    public static VkAccelerationStructureCreateInfoNV create(long address) {
        return wrap(VkAccelerationStructureCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAccelerationStructureCreateInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAccelerationStructureCreateInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCreateInfoNV mallocStack(MemoryStack stack) {
        return wrap(VkAccelerationStructureCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCreateInfoNV callocStack(MemoryStack stack) {
        return wrap(VkAccelerationStructureCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #compactedSize}. */
    public static long ncompactedSize(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureCreateInfoNV.COMPACTEDSIZE); }
    /** Unsafe version of {@link #info}. */
    public static VkAccelerationStructureInfoNV ninfo(long struct) { return VkAccelerationStructureInfoNV.create(struct + VkAccelerationStructureCreateInfoNV.INFO); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #compactedSize(long) compactedSize}. */
    public static void ncompactedSize(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureCreateInfoNV.COMPACTEDSIZE, value); }
    /** Unsafe version of {@link #info(VkAccelerationStructureInfoNV) info}. */
    public static void ninfo(long struct, VkAccelerationStructureInfoNV value) { memCopy(value.address(), struct + VkAccelerationStructureCreateInfoNV.INFO, VkAccelerationStructureInfoNV.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        VkAccelerationStructureInfoNV.validate(struct + VkAccelerationStructureCreateInfoNV.INFO);
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureCreateInfoNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureCreateInfoNV ELEMENT_FACTORY = VkAccelerationStructureCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkAccelerationStructureCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureCreateInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureCreateInfoNV.npNext(address()); }
        /** Returns the value of the {@code compactedSize} field. */
        @NativeType("VkDeviceSize")
        public long compactedSize() { return VkAccelerationStructureCreateInfoNV.ncompactedSize(address()); }
        /** Returns a {@link VkAccelerationStructureInfoNV} view of the {@code info} field. */
        public VkAccelerationStructureInfoNV info() { return VkAccelerationStructureCreateInfoNV.ninfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code compactedSize} field. */
        public VkAccelerationStructureCreateInfoNV.Buffer compactedSize(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoNV.ncompactedSize(address(), value); return this; }
        /** Copies the specified {@link VkAccelerationStructureInfoNV} to the {@code info} field. */
        public VkAccelerationStructureCreateInfoNV.Buffer info(VkAccelerationStructureInfoNV value) { VkAccelerationStructureCreateInfoNV.ninfo(address(), value); return this; }
        /** Passes the {@code info} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureCreateInfoNV.Buffer info(java.util.function.Consumer<VkAccelerationStructureInfoNV> consumer) { consumer.accept(info()); return this; }

    }

}