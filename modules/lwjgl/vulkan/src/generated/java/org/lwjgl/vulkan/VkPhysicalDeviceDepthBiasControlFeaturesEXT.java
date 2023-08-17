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
 * Structure indicating support for depth bias scaling and representation control.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDepthBiasControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDepthBiasControlFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #depthBiasControl};
 *     VkBool32 {@link #leastRepresentableValueForceUnormRepresentation};
 *     VkBool32 {@link #floatRepresentation};
 *     VkBool32 {@link #depthBiasExact};
 * }</code></pre>
 */
public class VkPhysicalDeviceDepthBiasControlFeaturesEXT extends Struct<VkPhysicalDeviceDepthBiasControlFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHBIASCONTROL,
        LEASTREPRESENTABLEVALUEFORCEUNORMREPRESENTATION,
        FLOATREPRESENTATION,
        DEPTHBIASEXACT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPTHBIASCONTROL = layout.offsetof(2);
        LEASTREPRESENTABLEVALUEFORCEUNORMREPRESENTATION = layout.offsetof(3);
        FLOATREPRESENTATION = layout.offsetof(4);
        DEPTHBIASEXACT = layout.offsetof(5);
    }

    protected VkPhysicalDeviceDepthBiasControlFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDepthBiasControlFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDepthBiasControlFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports the {@code vkCmdSetDepthBias2EXT} command and the {@link VkDepthBiasRepresentationInfoEXT} structure. */
    @NativeType("VkBool32")
    public boolean depthBiasControl() { return ndepthBiasControl(address()) != 0; }
    /** indicates whether the implementation supports using the {@link EXTDepthBiasControl#VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT} depth bias representation. */
    @NativeType("VkBool32")
    public boolean leastRepresentableValueForceUnormRepresentation() { return nleastRepresentableValueForceUnormRepresentation(address()) != 0; }
    /** indicates whether the implementation supports using the {@link EXTDepthBiasControl#VK_DEPTH_BIAS_REPRESENTATION_FLOAT_EXT DEPTH_BIAS_REPRESENTATION_FLOAT_EXT} depth bias representation. */
    @NativeType("VkBool32")
    public boolean floatRepresentation() { return nfloatRepresentation(address()) != 0; }
    /** indicates whether the implementation supports forcing depth bias to not be scaled to ensure a minimum resolvable difference using {@link VkDepthBiasRepresentationInfoEXT}{@code ::depthBiasExact}. */
    @NativeType("VkBool32")
    public boolean depthBiasExact() { return ndepthBiasExact(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthBiasControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT sType$Default() { return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #depthBiasControl} field. */
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasControl(@NativeType("VkBool32") boolean value) { ndepthBiasControl(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #leastRepresentableValueForceUnormRepresentation} field. */
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT leastRepresentableValueForceUnormRepresentation(@NativeType("VkBool32") boolean value) { nleastRepresentableValueForceUnormRepresentation(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #floatRepresentation} field. */
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT floatRepresentation(@NativeType("VkBool32") boolean value) { nfloatRepresentation(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #depthBiasExact} field. */
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasExact(@NativeType("VkBool32") boolean value) { ndepthBiasExact(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT set(
        int sType,
        long pNext,
        boolean depthBiasControl,
        boolean leastRepresentableValueForceUnormRepresentation,
        boolean floatRepresentation,
        boolean depthBiasExact
    ) {
        sType(sType);
        pNext(pNext);
        depthBiasControl(depthBiasControl);
        leastRepresentableValueForceUnormRepresentation(leastRepresentableValueForceUnormRepresentation);
        floatRepresentation(floatRepresentation);
        depthBiasExact(depthBiasExact);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT set(VkPhysicalDeviceDepthBiasControlFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDepthBiasControlFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT malloc() {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthBiasControlFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT calloc() {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthBiasControlFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthBiasControlFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDepthBiasControlFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthBiasControlFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthBiasControlFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #depthBiasControl}. */
    public static int ndepthBiasControl(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.DEPTHBIASCONTROL); }
    /** Unsafe version of {@link #leastRepresentableValueForceUnormRepresentation}. */
    public static int nleastRepresentableValueForceUnormRepresentation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.LEASTREPRESENTABLEVALUEFORCEUNORMREPRESENTATION); }
    /** Unsafe version of {@link #floatRepresentation}. */
    public static int nfloatRepresentation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.FLOATREPRESENTATION); }
    /** Unsafe version of {@link #depthBiasExact}. */
    public static int ndepthBiasExact(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.DEPTHBIASEXACT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #depthBiasControl(boolean) depthBiasControl}. */
    public static void ndepthBiasControl(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.DEPTHBIASCONTROL, value); }
    /** Unsafe version of {@link #leastRepresentableValueForceUnormRepresentation(boolean) leastRepresentableValueForceUnormRepresentation}. */
    public static void nleastRepresentableValueForceUnormRepresentation(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.LEASTREPRESENTABLEVALUEFORCEUNORMREPRESENTATION, value); }
    /** Unsafe version of {@link #floatRepresentation(boolean) floatRepresentation}. */
    public static void nfloatRepresentation(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.FLOATREPRESENTATION, value); }
    /** Unsafe version of {@link #depthBiasExact(boolean) depthBiasExact}. */
    public static void ndepthBiasExact(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthBiasControlFeaturesEXT.DEPTHBIASEXACT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDepthBiasControlFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDepthBiasControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDepthBiasControlFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDepthBiasControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#depthBiasControl} field. */
        @NativeType("VkBool32")
        public boolean depthBiasControl() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.ndepthBiasControl(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#leastRepresentableValueForceUnormRepresentation} field. */
        @NativeType("VkBool32")
        public boolean leastRepresentableValueForceUnormRepresentation() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.nleastRepresentableValueForceUnormRepresentation(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#floatRepresentation} field. */
        @NativeType("VkBool32")
        public boolean floatRepresentation() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.nfloatRepresentation(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#depthBiasExact} field. */
        @NativeType("VkBool32")
        public boolean depthBiasExact() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.ndepthBiasExact(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#sType} field. */
        public VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthBiasControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT} value to the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#sType} field. */
        public VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer sType$Default() { return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#depthBiasControl} field. */
        public VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer depthBiasControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.ndepthBiasControl(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#leastRepresentableValueForceUnormRepresentation} field. */
        public VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer leastRepresentableValueForceUnormRepresentation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.nleastRepresentableValueForceUnormRepresentation(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#floatRepresentation} field. */
        public VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer floatRepresentation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.nfloatRepresentation(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT#depthBiasExact} field. */
        public VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer depthBiasExact(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.ndepthBiasExact(address(), value ? 1 : 0); return this; }

    }

}