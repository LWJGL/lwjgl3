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
 * Structure returning information about whether a descriptor set layout can be supported.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code supported} is set to {@link VK10#VK_TRUE TRUE} if the descriptor set <b>can</b> be created, or else is set to {@link VK10#VK_FALSE FALSE}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkDescriptorSetVariableDescriptorCountLayoutSupport}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkGetDescriptorSetLayoutSupport GetDescriptorSetLayoutSupport}, {@link KHRMaintenance3#vkGetDescriptorSetLayoutSupportKHR GetDescriptorSetLayoutSupportKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetLayoutSupport {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #supported};
 * }</code></pre>
 */
public class VkDescriptorSetLayoutSupport extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTED = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDescriptorSetLayoutSupport} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutSupport(ByteBuffer container) {
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
    /** specifies whether the descriptor set layout <b>can</b> be created. */
    @NativeType("VkBool32")
    public boolean supported() { return nsupported(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDescriptorSetLayoutSupport sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT} value to the {@link #sType} field. */
    public VkDescriptorSetLayoutSupport sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDescriptorSetLayoutSupport pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDescriptorSetVariableDescriptorCountLayoutSupport} value to the {@code pNext} chain. */
    public VkDescriptorSetLayoutSupport pNext(VkDescriptorSetVariableDescriptorCountLayoutSupport value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} value to the {@code pNext} chain. */
    public VkDescriptorSetLayoutSupport pNext(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetLayoutSupport set(
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
    public VkDescriptorSetLayoutSupport set(VkDescriptorSetLayoutSupport src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetLayoutSupport} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutSupport malloc() {
        return wrap(VkDescriptorSetLayoutSupport.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetLayoutSupport} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutSupport calloc() {
        return wrap(VkDescriptorSetLayoutSupport.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetLayoutSupport} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetLayoutSupport create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorSetLayoutSupport.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetLayoutSupport} instance for the specified memory address. */
    public static VkDescriptorSetLayoutSupport create(long address) {
        return wrap(VkDescriptorSetLayoutSupport.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutSupport createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorSetLayoutSupport.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupport.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupport.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupport.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupport.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupport.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupport.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorSetLayoutSupport.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupport.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutSupport.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupport mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupport callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupport mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupport callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupport.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupport.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupport.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupport.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorSetLayoutSupport} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutSupport malloc(MemoryStack stack) {
        return wrap(VkDescriptorSetLayoutSupport.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutSupport} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutSupport calloc(MemoryStack stack) {
        return wrap(VkDescriptorSetLayoutSupport.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupport.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupport.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupport.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupport.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetLayoutSupport.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetLayoutSupport.PNEXT); }
    /** Unsafe version of {@link #supported}. */
    public static int nsupported(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetLayoutSupport.SUPPORTED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetLayoutSupport.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetLayoutSupport.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetLayoutSupport} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutSupport, Buffer> implements NativeResource {

        private static final VkDescriptorSetLayoutSupport ELEMENT_FACTORY = VkDescriptorSetLayoutSupport.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetLayoutSupport.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutSupport#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetLayoutSupport getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorSetLayoutSupport#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetLayoutSupport.nsType(address()); }
        /** @return the value of the {@link VkDescriptorSetLayoutSupport#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDescriptorSetLayoutSupport.npNext(address()); }
        /** @return the value of the {@link VkDescriptorSetLayoutSupport#supported} field. */
        @NativeType("VkBool32")
        public boolean supported() { return VkDescriptorSetLayoutSupport.nsupported(address()) != 0; }

        /** Sets the specified value to the {@link VkDescriptorSetLayoutSupport#sType} field. */
        public VkDescriptorSetLayoutSupport.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetLayoutSupport.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT} value to the {@link VkDescriptorSetLayoutSupport#sType} field. */
        public VkDescriptorSetLayoutSupport.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT); }
        /** Sets the specified value to the {@link VkDescriptorSetLayoutSupport#pNext} field. */
        public VkDescriptorSetLayoutSupport.Buffer pNext(@NativeType("void *") long value) { VkDescriptorSetLayoutSupport.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDescriptorSetVariableDescriptorCountLayoutSupport} value to the {@code pNext} chain. */
        public VkDescriptorSetLayoutSupport.Buffer pNext(VkDescriptorSetVariableDescriptorCountLayoutSupport value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} value to the {@code pNext} chain. */
        public VkDescriptorSetLayoutSupport.Buffer pNext(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}