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
 * <p>If the {@link VkPhysicalDeviceVariablePointersFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceVariablePointersFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code variablePointers} is enabled then {@code variablePointersStorageBuffer} <b>must</b> also be enabled</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVariablePointersFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #variablePointersStorageBuffer};
 *     VkBool32 {@link #variablePointers};
 * }</code></pre>
 */
public class VkPhysicalDeviceVariablePointersFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
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

    /**
     * Creates a {@code VkPhysicalDeviceVariablePointersFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVariablePointersFeatures(ByteBuffer container) {
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
    /** specifies whether the implementation supports the SPIR-V {@code VariablePointersStorageBuffer} capability. When this feature is not enabled, shader modules <b>must</b> not declare the {@code SPV_KHR_variable_pointers} extension or the {@code VariablePointersStorageBuffer} capability. */
    @NativeType("VkBool32")
    public boolean variablePointersStorageBuffer() { return nvariablePointersStorageBuffer(address()) != 0; }
    /** specifies whether the implementation supports the SPIR-V {@code VariablePointers} capability. When this feature is not enabled, shader modules <b>must</b> not declare the {@code VariablePointers} capability. */
    @NativeType("VkBool32")
    public boolean variablePointers() { return nvariablePointers(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVariablePointersFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceVariablePointersFeatures sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVariablePointersFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #variablePointersStorageBuffer} field. */
    public VkPhysicalDeviceVariablePointersFeatures variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #variablePointers} field. */
    public VkPhysicalDeviceVariablePointersFeatures variablePointers(@NativeType("VkBool32") boolean value) { nvariablePointers(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVariablePointersFeatures set(
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
    public VkPhysicalDeviceVariablePointersFeatures set(VkPhysicalDeviceVariablePointersFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVariablePointersFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointersFeatures malloc() {
        return wrap(VkPhysicalDeviceVariablePointersFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointersFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointersFeatures calloc() {
        return wrap(VkPhysicalDeviceVariablePointersFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointersFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVariablePointersFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVariablePointersFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointersFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceVariablePointersFeatures create(long address) {
        return wrap(VkPhysicalDeviceVariablePointersFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVariablePointersFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVariablePointersFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVariablePointersFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVariablePointersFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointersFeatures mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointersFeatures callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointersFeatures mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointersFeatures callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointersFeatures.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointersFeatures.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointersFeatures.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointersFeatures.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceVariablePointersFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointersFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVariablePointersFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVariablePointersFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointersFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVariablePointersFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointersFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointersFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVariablePointersFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVariablePointersFeatures.PNEXT); }
    /** Unsafe version of {@link #variablePointersStorageBuffer}. */
    public static int nvariablePointersStorageBuffer(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVariablePointersFeatures.VARIABLEPOINTERSSTORAGEBUFFER); }
    /** Unsafe version of {@link #variablePointers}. */
    public static int nvariablePointers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVariablePointersFeatures.VARIABLEPOINTERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVariablePointersFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVariablePointersFeatures.PNEXT, value); }
    /** Unsafe version of {@link #variablePointersStorageBuffer(boolean) variablePointersStorageBuffer}. */
    public static void nvariablePointersStorageBuffer(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVariablePointersFeatures.VARIABLEPOINTERSSTORAGEBUFFER, value); }
    /** Unsafe version of {@link #variablePointers(boolean) variablePointers}. */
    public static void nvariablePointers(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVariablePointersFeatures.VARIABLEPOINTERS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVariablePointersFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVariablePointersFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVariablePointersFeatures ELEMENT_FACTORY = VkPhysicalDeviceVariablePointersFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVariablePointersFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVariablePointersFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVariablePointersFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVariablePointersFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVariablePointersFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVariablePointersFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVariablePointersFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVariablePointersFeatures#variablePointersStorageBuffer} field. */
        @NativeType("VkBool32")
        public boolean variablePointersStorageBuffer() { return VkPhysicalDeviceVariablePointersFeatures.nvariablePointersStorageBuffer(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVariablePointersFeatures#variablePointers} field. */
        @NativeType("VkBool32")
        public boolean variablePointers() { return VkPhysicalDeviceVariablePointersFeatures.nvariablePointers(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceVariablePointersFeatures#sType} field. */
        public VkPhysicalDeviceVariablePointersFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVariablePointersFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES} value to the {@link VkPhysicalDeviceVariablePointersFeatures#sType} field. */
        public VkPhysicalDeviceVariablePointersFeatures.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVariablePointersFeatures#pNext} field. */
        public VkPhysicalDeviceVariablePointersFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVariablePointersFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVariablePointersFeatures#variablePointersStorageBuffer} field. */
        public VkPhysicalDeviceVariablePointersFeatures.Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointersFeatures.nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVariablePointersFeatures#variablePointers} field. */
        public VkPhysicalDeviceVariablePointersFeatures.Buffer variablePointers(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointersFeatures.nvariablePointers(address(), value ? 1 : 0); return this; }

    }

}