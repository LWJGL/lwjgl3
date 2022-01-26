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
 * Structure describing what extended dynamic state can be used.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTExtendedDynamicState#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceExtendedDynamicStateFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #extendedDynamicState};
 * }</code></pre>
 */
public class VkPhysicalDeviceExtendedDynamicStateFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTENDEDDYNAMICSTATE;

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
        EXTENDEDDYNAMICSTATE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(ByteBuffer container) {
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
    /**
     * indicates that the implementation supports the following dynamic states:
     * 
     * <ul>
     * <li>{@link VK13#VK_DYNAMIC_STATE_CULL_MODE DYNAMIC_STATE_CULL_MODE}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_FRONT_FACE DYNAMIC_STATE_FRONT_FACE}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY DYNAMIC_STATE_PRIMITIVE_TOPOLOGY}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE DYNAMIC_STATE_DEPTH_TEST_ENABLE}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE DYNAMIC_STATE_DEPTH_WRITE_ENABLE}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_DEPTH_COMPARE_OP DYNAMIC_STATE_DEPTH_COMPARE_OP}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE DYNAMIC_STATE_STENCIL_TEST_ENABLE}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_STENCIL_OP DYNAMIC_STATE_STENCIL_OP}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState() { return nextendedDynamicState(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExtendedDynamicState#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT sType$Default() { return sType(EXTExtendedDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState} field. */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT extendedDynamicState(@NativeType("VkBool32") boolean value) { nextendedDynamicState(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT set(
        int sType,
        long pNext,
        boolean extendedDynamicState
    ) {
        sType(sType);
        pNext(pNext);
        extendedDynamicState(extendedDynamicState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT set(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #extendedDynamicState}. */
    public static int nextendedDynamicState(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.EXTENDEDDYNAMICSTATE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #extendedDynamicState(boolean) extendedDynamicState}. */
    public static void nextendedDynamicState(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.EXTENDEDDYNAMICSTATE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedDynamicStateFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExtendedDynamicStateFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceExtendedDynamicStateFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT#extendedDynamicState} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState() { return VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nextendedDynamicState(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT#sType} field. */
        public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExtendedDynamicState#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT} value to the {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT#sType} field. */
        public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer sType$Default() { return sType(EXTExtendedDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT#extendedDynamicState} field. */
        public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer extendedDynamicState(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nextendedDynamicState(address(), value ? 1 : 0); return this; }

    }

}