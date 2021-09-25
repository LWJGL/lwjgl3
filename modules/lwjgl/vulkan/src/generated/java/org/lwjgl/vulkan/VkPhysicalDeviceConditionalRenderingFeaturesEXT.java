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
 * Structure describing if a secondary command buffer can be executed if conditional rendering is active in the primary command buffer.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTConditionalRendering#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceConditionalRenderingFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #conditionalRendering};
 *     VkBool32 {@link #inheritedConditionalRendering};
 * }</code></pre>
 */
public class VkPhysicalDeviceConditionalRenderingFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CONDITIONALRENDERING,
        INHERITEDCONDITIONALRENDERING;

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
        CONDITIONALRENDERING = layout.offsetof(2);
        INHERITEDCONDITIONALRENDERING = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceConditionalRenderingFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT(ByteBuffer container) {
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
    /** specifies whether conditional rendering is supported. */
    @NativeType("VkBool32")
    public boolean conditionalRendering() { return nconditionalRendering(address()) != 0; }
    /** specifies whether a secondary command buffer <b>can</b> be executed while conditional rendering is active in the primary command buffer. */
    @NativeType("VkBool32")
    public boolean inheritedConditionalRendering() { return ninheritedConditionalRendering(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTConditionalRendering#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT sType$Default() { return sType(EXTConditionalRendering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #conditionalRendering} field. */
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT conditionalRendering(@NativeType("VkBool32") boolean value) { nconditionalRendering(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #inheritedConditionalRendering} field. */
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT inheritedConditionalRendering(@NativeType("VkBool32") boolean value) { ninheritedConditionalRendering(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT set(
        int sType,
        long pNext,
        boolean conditionalRendering,
        boolean inheritedConditionalRendering
    ) {
        sType(sType);
        pNext(pNext);
        conditionalRendering(conditionalRendering);
        inheritedConditionalRendering(inheritedConditionalRendering);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT set(VkPhysicalDeviceConditionalRenderingFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceConditionalRenderingFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceConditionalRenderingFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceConditionalRenderingFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceConditionalRenderingFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceConditionalRenderingFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceConditionalRenderingFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceConditionalRenderingFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceConditionalRenderingFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceConditionalRenderingFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConditionalRenderingFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConditionalRenderingFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConditionalRenderingFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConditionalRenderingFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceConditionalRenderingFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceConditionalRenderingFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceConditionalRenderingFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceConditionalRenderingFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceConditionalRenderingFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceConditionalRenderingFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #conditionalRendering}. */
    public static int nconditionalRendering(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceConditionalRenderingFeaturesEXT.CONDITIONALRENDERING); }
    /** Unsafe version of {@link #inheritedConditionalRendering}. */
    public static int ninheritedConditionalRendering(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceConditionalRenderingFeaturesEXT.INHERITEDCONDITIONALRENDERING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceConditionalRenderingFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceConditionalRenderingFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #conditionalRendering(boolean) conditionalRendering}. */
    public static void nconditionalRendering(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceConditionalRenderingFeaturesEXT.CONDITIONALRENDERING, value); }
    /** Unsafe version of {@link #inheritedConditionalRendering(boolean) inheritedConditionalRendering}. */
    public static void ninheritedConditionalRendering(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceConditionalRenderingFeaturesEXT.INHERITEDCONDITIONALRENDERING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceConditionalRenderingFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceConditionalRenderingFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceConditionalRenderingFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceConditionalRenderingFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT#conditionalRendering} field. */
        @NativeType("VkBool32")
        public boolean conditionalRendering() { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.nconditionalRendering(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT#inheritedConditionalRendering} field. */
        @NativeType("VkBool32")
        public boolean inheritedConditionalRendering() { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.ninheritedConditionalRendering(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT#sType} field. */
        public VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTConditionalRendering#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT} value to the {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT#sType} field. */
        public VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer sType$Default() { return sType(EXTConditionalRendering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT#conditionalRendering} field. */
        public VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer conditionalRendering(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.nconditionalRendering(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT#inheritedConditionalRendering} field. */
        public VkPhysicalDeviceConditionalRenderingFeaturesEXT.Buffer inheritedConditionalRendering(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.ninheritedConditionalRendering(address(), value ? 1 : 0); return this; }

    }

}