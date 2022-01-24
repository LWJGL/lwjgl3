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
 * Structure describing additional depth clip control supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDepthClipControlFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceDepthClipControlFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDepthClipControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_CONTROL_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDepthClipControlFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #depthClipControl};
 * }</code></pre>
 */
public class VkPhysicalDeviceDepthClipControlFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHCLIPCONTROL;

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
        DEPTHCLIPCONTROL = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDepthClipControlFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDepthClipControlFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports setting {@link VkPipelineViewportDepthClipControlCreateInfoEXT}{@code ::negativeOneToOne} to {@link VK10#VK_TRUE TRUE}. */
    @NativeType("VkBool32")
    public boolean depthClipControl() { return ndepthClipControl(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDepthClipControlFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthClipControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_CONTROL_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceDepthClipControlFeaturesEXT sType$Default() { return sType(EXTDepthClipControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_CONTROL_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDepthClipControlFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #depthClipControl} field. */
    public VkPhysicalDeviceDepthClipControlFeaturesEXT depthClipControl(@NativeType("VkBool32") boolean value) { ndepthClipControl(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDepthClipControlFeaturesEXT set(
        int sType,
        long pNext,
        boolean depthClipControl
    ) {
        sType(sType);
        pNext(pNext);
        depthClipControl(depthClipControl);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDepthClipControlFeaturesEXT set(VkPhysicalDeviceDepthClipControlFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDepthClipControlFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceDepthClipControlFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClipControlFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceDepthClipControlFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClipControlFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDepthClipControlFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClipControlFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceDepthClipControlFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDepthClipControlFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthClipControlFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDepthClipControlFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthClipControlFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDepthClipControlFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthClipControlFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDepthClipControlFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #depthClipControl}. */
    public static int ndepthClipControl(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthClipControlFeaturesEXT.DEPTHCLIPCONTROL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthClipControlFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDepthClipControlFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #depthClipControl(boolean) depthClipControl}. */
    public static void ndepthClipControl(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthClipControlFeaturesEXT.DEPTHCLIPCONTROL, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDepthClipControlFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDepthClipControlFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDepthClipControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDepthClipControlFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDepthClipControlFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDepthClipControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDepthClipControlFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDepthClipControlFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDepthClipControlFeaturesEXT#depthClipControl} field. */
        @NativeType("VkBool32")
        public boolean depthClipControl() { return VkPhysicalDeviceDepthClipControlFeaturesEXT.ndepthClipControl(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDepthClipControlFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthClipControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_CONTROL_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer sType$Default() { return sType(EXTDepthClipControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_CONTROL_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDepthClipControlFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDepthClipControlFeaturesEXT#depthClipControl} field. */
        public VkPhysicalDeviceDepthClipControlFeaturesEXT.Buffer depthClipControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDepthClipControlFeaturesEXT.ndepthClipControl(address(), value ? 1 : 0); return this; }

    }

}