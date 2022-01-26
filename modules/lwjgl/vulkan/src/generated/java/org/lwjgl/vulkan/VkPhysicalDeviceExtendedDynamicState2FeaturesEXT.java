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
 * <p>If the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTExtendedDynamicState2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #extendedDynamicState2};
 *     VkBool32 {@link #extendedDynamicState2LogicOp};
 *     VkBool32 {@link #extendedDynamicState2PatchControlPoints};
 * }</code></pre>
 */
public class VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTENDEDDYNAMICSTATE2,
        EXTENDEDDYNAMICSTATE2LOGICOP,
        EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTENDEDDYNAMICSTATE2 = layout.offsetof(2);
        EXTENDEDDYNAMICSTATE2LOGICOP = layout.offsetof(3);
        EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(ByteBuffer container) {
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
     * <li>{@link VK13#VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE DYNAMIC_STATE_DEPTH_BIAS_ENABLE}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE}</li>
     * <li>{@link VK13#VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState2() { return nextendedDynamicState2(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_LOGIC_OP_EXT DYNAMIC_STATE_LOGIC_OP_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState2LogicOp() { return nextendedDynamicState2LogicOp(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState2PatchControlPoints() { return nextendedDynamicState2PatchControlPoints(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExtendedDynamicState2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sType$Default() { return sType(EXTExtendedDynamicState2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState2} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2(@NativeType("VkBool32") boolean value) { nextendedDynamicState2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState2LogicOp} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2LogicOp(@NativeType("VkBool32") boolean value) { nextendedDynamicState2LogicOp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState2PatchControlPoints} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2PatchControlPoints(@NativeType("VkBool32") boolean value) { nextendedDynamicState2PatchControlPoints(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT set(
        int sType,
        long pNext,
        boolean extendedDynamicState2,
        boolean extendedDynamicState2LogicOp,
        boolean extendedDynamicState2PatchControlPoints
    ) {
        sType(sType);
        pNext(pNext);
        extendedDynamicState2(extendedDynamicState2);
        extendedDynamicState2LogicOp(extendedDynamicState2LogicOp);
        extendedDynamicState2PatchControlPoints(extendedDynamicState2PatchControlPoints);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT set(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #extendedDynamicState2}. */
    public static int nextendedDynamicState2(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2); }
    /** Unsafe version of {@link #extendedDynamicState2LogicOp}. */
    public static int nextendedDynamicState2LogicOp(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2LOGICOP); }
    /** Unsafe version of {@link #extendedDynamicState2PatchControlPoints}. */
    public static int nextendedDynamicState2PatchControlPoints(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #extendedDynamicState2(boolean) extendedDynamicState2}. */
    public static void nextendedDynamicState2(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2, value); }
    /** Unsafe version of {@link #extendedDynamicState2LogicOp(boolean) extendedDynamicState2LogicOp}. */
    public static void nextendedDynamicState2LogicOp(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2LOGICOP, value); }
    /** Unsafe version of {@link #extendedDynamicState2PatchControlPoints(boolean) extendedDynamicState2PatchControlPoints}. */
    public static void nextendedDynamicState2PatchControlPoints(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceExtendedDynamicState2FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#extendedDynamicState2} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState2() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#extendedDynamicState2LogicOp} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState2LogicOp() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2LogicOp(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#extendedDynamicState2PatchControlPoints} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState2PatchControlPoints() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2PatchControlPoints(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#sType} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExtendedDynamicState2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT} value to the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#sType} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer sType$Default() { return sType(EXTExtendedDynamicState2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#pNext} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#extendedDynamicState2} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer extendedDynamicState2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#extendedDynamicState2LogicOp} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer extendedDynamicState2LogicOp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2LogicOp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#extendedDynamicState2PatchControlPoints} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer extendedDynamicState2PatchControlPoints(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2PatchControlPoints(address(), value ? 1 : 0); return this; }

    }

}