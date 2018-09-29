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
 * Structure specifying acceleration to query for memory requirements.
 * 
 * <h5>Description</h5>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXRaytracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NVX STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVXRaytracing#vkGetAccelerationStructureMemoryRequirementsNVX GetAccelerationStructureMemoryRequirementsNVX}, {@link NVXRaytracing#vkGetAccelerationStructureScratchMemoryRequirementsNVX GetAccelerationStructureScratchMemoryRequirementsNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code accelerationStructure} &ndash; the acceleration structure to be queried for memory requirements.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureMemoryRequirementsInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccelerationStructureNVX accelerationStructure;
 * }</code></pre>
 */
public class VkAccelerationStructureMemoryRequirementsInfoNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACCELERATIONSTRUCTURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
    }

    VkAccelerationStructureMemoryRequirementsInfoNVX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkAccelerationStructureMemoryRequirementsInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureMemoryRequirementsInfoNVX(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code accelerationStructure} field. */
    @NativeType("VkAccelerationStructureNVX")
    public long accelerationStructure() { return naccelerationStructure(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureMemoryRequirementsInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureMemoryRequirementsInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructure} field. */
    public VkAccelerationStructureMemoryRequirementsInfoNVX accelerationStructure(@NativeType("VkAccelerationStructureNVX") long value) { naccelerationStructure(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureMemoryRequirementsInfoNVX set(
        int sType,
        long pNext,
        long accelerationStructure
    ) {
        sType(sType);
        pNext(pNext);
        accelerationStructure(accelerationStructure);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureMemoryRequirementsInfoNVX set(VkAccelerationStructureMemoryRequirementsInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX create() {
        return new VkAccelerationStructureMemoryRequirementsInfoNVX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX} instance for the specified memory address. */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX create(long address) {
        return new VkAccelerationStructureMemoryRequirementsInfoNVX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureMemoryRequirementsInfoNVX createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureMemoryRequirementsInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureMemoryRequirementsInfoNVX.PNEXT); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static long naccelerationStructure(long struct) { return memGetLong(struct + VkAccelerationStructureMemoryRequirementsInfoNVX.ACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureMemoryRequirementsInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureMemoryRequirementsInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #accelerationStructure(long) accelerationStructure}. */
    public static void naccelerationStructure(long struct, long value) { memPutLong(struct + VkAccelerationStructureMemoryRequirementsInfoNVX.ACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureMemoryRequirementsInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureMemoryRequirementsInfoNVX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureMemoryRequirementsInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkAccelerationStructureMemoryRequirementsInfoNVX newInstance(long address) {
            return new VkAccelerationStructureMemoryRequirementsInfoNVX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureMemoryRequirementsInfoNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureMemoryRequirementsInfoNVX.npNext(address()); }
        /** Returns the value of the {@code accelerationStructure} field. */
        @NativeType("VkAccelerationStructureNVX")
        public long accelerationStructure() { return VkAccelerationStructureMemoryRequirementsInfoNVX.naccelerationStructure(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureMemoryRequirementsInfoNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureMemoryRequirementsInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructure} field. */
        public VkAccelerationStructureMemoryRequirementsInfoNVX.Buffer accelerationStructure(@NativeType("VkAccelerationStructureNVX") long value) { VkAccelerationStructureMemoryRequirementsInfoNVX.naccelerationStructure(address(), value); return this; }

    }

}