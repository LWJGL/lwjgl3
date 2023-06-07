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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure describing shader module identifier properties of an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The algorithm UUID may be the same in different ICDs if the algorithms are guaranteed to produce the same results. This may happen in driver stacks which support different kinds of hardware with shared code.</p>
 * 
 * <p>Khronos' conformance testing can not guarantee that {@code shaderModuleIdentifierAlgorithmUUID} values are actually unique, so implementors should make their own best efforts to ensure that their UUID is unlikely to conflict with other implementations which may use a different algorithm. In particular, hard-coded values which easily conflict, such as all-0 bits, <b>should</b> never be used. Hard-coded values are acceptable if best effort is ensured that the value will not accidentally conflict.</p>
 * </div>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTShaderModuleIdentifier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint8_t {@link #shaderModuleIdentifierAlgorithmUUID}[VK_UUID_SIZE];
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT extends Struct<VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERMODULEIDENTIFIERALGORITHMUUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERMODULEIDENTIFIERALGORITHMUUID = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(ByteBuffer container) {
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
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values which uniquely represents the algorithm used to compute an identifier in {@link EXTShaderModuleIdentifier#vkGetShaderModuleIdentifierEXT GetShaderModuleIdentifierEXT} and {@link EXTShaderModuleIdentifier#vkGetShaderModuleCreateInfoIdentifierEXT GetShaderModuleCreateInfoIdentifierEXT}. Implementations <b>should</b> not change this value in different driver versions if the algorithm used to compute an identifier is the same. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer shaderModuleIdentifierAlgorithmUUID() { return nshaderModuleIdentifierAlgorithmUUID(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values which uniquely represents the algorithm used to compute an identifier in {@link EXTShaderModuleIdentifier#vkGetShaderModuleIdentifierEXT GetShaderModuleIdentifierEXT} and {@link EXTShaderModuleIdentifier#vkGetShaderModuleCreateInfoIdentifierEXT GetShaderModuleCreateInfoIdentifierEXT}. Implementations <b>should</b> not change this value in different driver versions if the algorithm used to compute an identifier is the same. */
    @NativeType("uint8_t")
    public byte shaderModuleIdentifierAlgorithmUUID(int index) { return nshaderModuleIdentifierAlgorithmUUID(address(), index); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderModuleIdentifier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT sType$Default() { return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT set(
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
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT set(VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT malloc() {
        return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT calloc() {
        return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT create(long address) {
        return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderModuleIdentifierAlgorithmUUID}. */
    public static ByteBuffer nshaderModuleIdentifierAlgorithmUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.SHADERMODULEIDENTIFIERALGORITHMUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #shaderModuleIdentifierAlgorithmUUID(int) shaderModuleIdentifierAlgorithmUUID}. */
    public static byte nshaderModuleIdentifierAlgorithmUUID(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.SHADERMODULEIDENTIFIERALGORITHMUUID + check(index, VK_UUID_SIZE) * 1);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT#shaderModuleIdentifierAlgorithmUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer shaderModuleIdentifierAlgorithmUUID() { return VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.nshaderModuleIdentifierAlgorithmUUID(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT#shaderModuleIdentifierAlgorithmUUID} field. */
        @NativeType("uint8_t")
        public byte shaderModuleIdentifierAlgorithmUUID(int index) { return VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.nshaderModuleIdentifierAlgorithmUUID(address(), index); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderModuleIdentifier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer sType$Default() { return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.npNext(address(), value); return this; }

    }

}