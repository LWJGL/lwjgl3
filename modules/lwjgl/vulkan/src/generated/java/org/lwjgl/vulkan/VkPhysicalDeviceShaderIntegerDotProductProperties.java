/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceShaderIntegerDotProductProperties {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 integerDotProduct8BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct8BitSignedAccelerated;
 *     VkBool32 integerDotProduct8BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct4x8BitPackedUnsignedAccelerated;
 *     VkBool32 integerDotProduct4x8BitPackedSignedAccelerated;
 *     VkBool32 integerDotProduct4x8BitPackedMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct16BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct16BitSignedAccelerated;
 *     VkBool32 integerDotProduct16BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct32BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct32BitSignedAccelerated;
 *     VkBool32 integerDotProduct32BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct64BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct64BitSignedAccelerated;
 *     VkBool32 integerDotProduct64BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating8BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating8BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating16BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating16BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating32BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating32BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating64BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating64BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderIntegerDotProductProperties extends Struct<VkPhysicalDeviceShaderIntegerDotProductProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT8BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED,
        INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT16BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT32BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT64BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED = layout.offsetof(2);
        INTEGERDOTPRODUCT8BITSIGNEDACCELERATED = layout.offsetof(3);
        INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(4);
        INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED = layout.offsetof(5);
        INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED = layout.offsetof(6);
        INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = layout.offsetof(7);
        INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED = layout.offsetof(8);
        INTEGERDOTPRODUCT16BITSIGNEDACCELERATED = layout.offsetof(9);
        INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(10);
        INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED = layout.offsetof(11);
        INTEGERDOTPRODUCT32BITSIGNEDACCELERATED = layout.offsetof(12);
        INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(13);
        INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED = layout.offsetof(14);
        INTEGERDOTPRODUCT64BITSIGNEDACCELERATED = layout.offsetof(15);
        INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(16);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED = layout.offsetof(17);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED = layout.offsetof(18);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(19);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED = layout.offsetof(20);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED = layout.offsetof(21);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = layout.offsetof(22);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED = layout.offsetof(23);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED = layout.offsetof(24);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(25);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED = layout.offsetof(26);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED = layout.offsetof(27);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(28);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED = layout.offsetof(29);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED = layout.offsetof(30);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(31);
    }

    protected VkPhysicalDeviceShaderIntegerDotProductProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderIntegerDotProductProperties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderIntegerDotProductProperties(ByteBuffer container) {
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
    /** @return the value of the {@code integerDotProduct8BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitUnsignedAccelerated() { return nintegerDotProduct8BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct8BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitSignedAccelerated() { return nintegerDotProduct8BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct8BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitMixedSignednessAccelerated() { return nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct4x8BitPackedUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() { return nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct4x8BitPackedSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedSignedAccelerated() { return nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct4x8BitPackedMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct16BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitUnsignedAccelerated() { return nintegerDotProduct16BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct16BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitSignedAccelerated() { return nintegerDotProduct16BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct16BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitMixedSignednessAccelerated() { return nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct32BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitUnsignedAccelerated() { return nintegerDotProduct32BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct32BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitSignedAccelerated() { return nintegerDotProduct32BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct32BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitMixedSignednessAccelerated() { return nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct64BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitUnsignedAccelerated() { return nintegerDotProduct64BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct64BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitSignedAccelerated() { return nintegerDotProduct64BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct64BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitMixedSignednessAccelerated() { return nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderIntegerDotProductProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderIntegerDotProductProperties sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderIntegerDotProductProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderIntegerDotProductProperties set(
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
    public VkPhysicalDeviceShaderIntegerDotProductProperties set(VkPhysicalDeviceShaderIntegerDotProductProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties malloc() {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties calloc() {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties create(long address) {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderIntegerDotProductProperties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderIntegerDotProductProperties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.PNEXT); }
    /** Unsafe version of {@link #integerDotProduct8BitUnsignedAccelerated}. */
    public static int nintegerDotProduct8BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct8BitSignedAccelerated}. */
    public static int nintegerDotProduct8BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct8BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct8BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedUnsignedAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedSignedAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedMixedSignednessAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitUnsignedAccelerated}. */
    public static int nintegerDotProduct16BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitSignedAccelerated}. */
    public static int nintegerDotProduct16BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct16BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitUnsignedAccelerated}. */
    public static int nintegerDotProduct32BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitSignedAccelerated}. */
    public static int nintegerDotProduct32BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct32BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitUnsignedAccelerated}. */
    public static int nintegerDotProduct64BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitSignedAccelerated}. */
    public static int nintegerDotProduct64BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct64BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderIntegerDotProductProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderIntegerDotProductProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderIntegerDotProductProperties ELEMENT_FACTORY = VkPhysicalDeviceShaderIntegerDotProductProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderIntegerDotProductProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceShaderIntegerDotProductProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderIntegerDotProductProperties.npNext(address()); }
        /** @return the value of the {@code integerDotProduct8BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct8BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct8BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct4x8BitPackedUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct4x8BitPackedSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct4x8BitPackedMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct16BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct16BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct16BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct32BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct32BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct32BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct64BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct64BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct64BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderIntegerDotProductProperties.npNext(address(), value); return this; }

    }

}