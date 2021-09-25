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
 * Structure indicating support for explicit enable of depth clip.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDepthClipEnable#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDepthClipEnableFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #depthClipEnable};
 * }</code></pre>
 */
public class VkPhysicalDeviceDepthClipEnableFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHCLIPENABLE;

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
        DEPTHCLIPENABLE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDepthClipEnableFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports setting the depth clipping operation explicitly via the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT} pipeline state. Otherwise depth clipping is only enabled when {@link VkPipelineRasterizationStateCreateInfo}{@code ::depthClampEnable} is set to {@link VK10#VK_FALSE FALSE}. */
    @NativeType("VkBool32")
    public boolean depthClipEnable() { return ndepthClipEnable(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthClipEnable#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT sType$Default() { return sType(EXTDepthClipEnable.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #depthClipEnable} field. */
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT depthClipEnable(@NativeType("VkBool32") boolean value) { ndepthClipEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT set(
        int sType,
        long pNext,
        boolean depthClipEnable
    ) {
        sType(sType);
        pNext(pNext);
        depthClipEnable(depthClipEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT set(VkPhysicalDeviceDepthClipEnableFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDepthClipEnableFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceDepthClipEnableFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClipEnableFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceDepthClipEnableFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClipEnableFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDepthClipEnableFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClipEnableFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceDepthClipEnableFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDepthClipEnableFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDepthClipEnableFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDepthClipEnableFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDepthClipEnableFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDepthClipEnableFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthClipEnableFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDepthClipEnableFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthClipEnableFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDepthClipEnableFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthClipEnableFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDepthClipEnableFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #depthClipEnable}. */
    public static int ndepthClipEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthClipEnableFeaturesEXT.DEPTHCLIPENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthClipEnableFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDepthClipEnableFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #depthClipEnable(boolean) depthClipEnable}. */
    public static void ndepthClipEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthClipEnableFeaturesEXT.DEPTHCLIPENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDepthClipEnableFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDepthClipEnableFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDepthClipEnableFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDepthClipEnableFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDepthClipEnableFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDepthClipEnableFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT#depthClipEnable} field. */
        @NativeType("VkBool32")
        public boolean depthClipEnable() { return VkPhysicalDeviceDepthClipEnableFeaturesEXT.ndepthClipEnable(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT#sType} field. */
        public VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDepthClipEnableFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthClipEnable#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT} value to the {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT#sType} field. */
        public VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer sType$Default() { return sType(EXTDepthClipEnable.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDepthClipEnableFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT#depthClipEnable} field. */
        public VkPhysicalDeviceDepthClipEnableFeaturesEXT.Buffer depthClipEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDepthClipEnableFeaturesEXT.ndepthClipEnable(address(), value ? 1 : 0); return this; }

    }

}