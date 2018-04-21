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
 * Structure describing variable pointers features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVariablePointerFeatures} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceVariablePointerFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the features.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code variablePointers} is enabled then {@code variablePointersStorageBuffer} <b>must</b> also be enabled.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code variablePointersStorageBuffer} &ndash; specifies whether the implementation supports the SPIR-V {@code VariablePointersStorageBuffer} capability. When this feature is not enabled, shader modules <b>must</b> not declare the {@code SPV_KHR_variable_pointers} extension or the {@code VariablePointersStorageBuffer} capability.</li>
 * <li>{@code variablePointers} &ndash; specifies whether the implementation supports the SPIR-V {@code VariablePointers} capability. When this feature is not enabled, shader modules <b>must</b> not declare the {@code VariablePointers} capability.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceVariablePointerFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 variablePointersStorageBuffer;
 *     VkBool32 variablePointers;
 * }</pre></code>
 */
public class VkPhysicalDeviceVariablePointerFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VARIABLEPOINTERSSTORAGEBUFFER,
        VARIABLEPOINTERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VARIABLEPOINTERSSTORAGEBUFFER = layout.offsetof(2);
        VARIABLEPOINTERS = layout.offsetof(3);
    }

    VkPhysicalDeviceVariablePointerFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceVariablePointerFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVariablePointerFeatures(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code variablePointersStorageBuffer} field. */
    @NativeType("VkBool32")
    public boolean variablePointersStorageBuffer() { return nvariablePointersStorageBuffer(address()) != 0; }
    /** Returns the value of the {@code variablePointers} field. */
    @NativeType("VkBool32")
    public boolean variablePointers() { return nvariablePointers(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVariablePointerFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVariablePointerFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
    public VkPhysicalDeviceVariablePointerFeatures variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code variablePointers} field. */
    public VkPhysicalDeviceVariablePointerFeatures variablePointers(@NativeType("VkBool32") boolean value) { nvariablePointers(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVariablePointerFeatures set(
        int sType,
        long pNext,
        boolean variablePointersStorageBuffer,
        boolean variablePointers
    ) {
        sType(sType);
        pNext(pNext);
        variablePointersStorageBuffer(variablePointersStorageBuffer);
        variablePointers(variablePointers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVariablePointerFeatures set(VkPhysicalDeviceVariablePointerFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointerFeatures malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointerFeatures calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVariablePointerFeatures create() {
        return new VkPhysicalDeviceVariablePointerFeatures(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceVariablePointerFeatures create(long address) {
        return new VkPhysicalDeviceVariablePointerFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVariablePointerFeatures createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeatures} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceVariablePointerFeatures mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeatures} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceVariablePointerFeatures callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointerFeatures mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointerFeatures callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeatures.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVariablePointerFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVariablePointerFeatures.PNEXT); }
    /** Unsafe version of {@link #variablePointersStorageBuffer}. */
    public static int nvariablePointersStorageBuffer(long struct) { return memGetInt(struct + VkPhysicalDeviceVariablePointerFeatures.VARIABLEPOINTERSSTORAGEBUFFER); }
    /** Unsafe version of {@link #variablePointers}. */
    public static int nvariablePointers(long struct) { return memGetInt(struct + VkPhysicalDeviceVariablePointerFeatures.VARIABLEPOINTERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVariablePointerFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVariablePointerFeatures.PNEXT, value); }
    /** Unsafe version of {@link #variablePointersStorageBuffer(boolean) variablePointersStorageBuffer}. */
    public static void nvariablePointersStorageBuffer(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVariablePointerFeatures.VARIABLEPOINTERSSTORAGEBUFFER, value); }
    /** Unsafe version of {@link #variablePointers(boolean) variablePointers}. */
    public static void nvariablePointers(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVariablePointerFeatures.VARIABLEPOINTERS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVariablePointerFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVariablePointerFeatures, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceVariablePointerFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVariablePointerFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVariablePointerFeatures newInstance(long address) {
            return new VkPhysicalDeviceVariablePointerFeatures(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVariablePointerFeatures.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVariablePointerFeatures.npNext(address()); }
        /** Returns the value of the {@code variablePointersStorageBuffer} field. */
        @NativeType("VkBool32")
        public boolean variablePointersStorageBuffer() { return VkPhysicalDeviceVariablePointerFeatures.nvariablePointersStorageBuffer(address()) != 0; }
        /** Returns the value of the {@code variablePointers} field. */
        @NativeType("VkBool32")
        public boolean variablePointers() { return VkPhysicalDeviceVariablePointerFeatures.nvariablePointers(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVariablePointerFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVariablePointerFeatures.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVariablePointerFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVariablePointerFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
        public VkPhysicalDeviceVariablePointerFeatures.Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointerFeatures.nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code variablePointers} field. */
        public VkPhysicalDeviceVariablePointerFeatures.Buffer variablePointers(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointerFeatures.nvariablePointers(address(), value ? 1 : 0); return this; }

    }

}