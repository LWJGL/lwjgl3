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

/**
 * Struct specifying parameters of a newly created indirect execution set containing only shader objects.
 * 
 * <h5>Description</h5>
 * 
 * <p>The characteristics of {@code pInitialShaders} will be used to validate all shaders added to the set even if they are removed from the set or destroyed.</p>
 * 
 * <p>When an Indirect Execution Set created with shader objects is used, {@code pInitialShaders} constitutes the initial shader state.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>All members of {@code pInitialShaders} <b>must</b> have a {@code stage} supported by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-supportedIndirectCommandsShaderStagesShaderBinding">{@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::supportedIndirectCommandsShaderStagesShaderBinding}</a></li>
 * <li>{@code maxShaderCount} <b>must</b> not be zero</li>
 * <li>{@code maxShaderCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::maxIndirectShaderObjectCount}</li>
 * <li>{@code maxShaderCount} <b>must</b> be greater than or equal to {@code shaderCount}</li>
 * <li>The {@code stage} of each element in the {@code pInitialShaders} array <b>must</b> be unique</li>
 * <li>Each member of {@code pInitialShaders} <b>must</b> have been created with {@link EXTDeviceGeneratedCommands#VK_SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT}</li>
 * <li>{@code pInitialShaders} <b>must</b> be a valid pointer to an array of {@code shaderCount} valid {@code VkShaderEXT} handles</li>
 * <li>If {@code pSetLayoutInfos} is not {@code NULL}, {@code pSetLayoutInfos} <b>must</b> be a valid pointer to an array of {@code shaderCount} valid {@link VkIndirectExecutionSetShaderLayoutInfoEXT} structures</li>
 * <li>If {@code pushConstantRangeCount} is not 0, {@code pPushConstantRanges} <b>must</b> be a valid pointer to an array of {@code pushConstantRangeCount} valid {@link VkPushConstantRange} structures</li>
 * <li>{@code shaderCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkIndirectExecutionSetInfoEXT}, {@link VkIndirectExecutionSetShaderLayoutInfoEXT}, {@link VkPushConstantRange}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkIndirectExecutionSetShaderInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #shaderCount};
 *     VkShaderEXT const * {@link #pInitialShaders};
 *     {@link VkIndirectExecutionSetShaderLayoutInfoEXT VkIndirectExecutionSetShaderLayoutInfoEXT} const * {@link #pSetLayoutInfos};
 *     uint32_t {@link #maxShaderCount};
 *     uint32_t {@link #pushConstantRangeCount};
 *     {@link VkPushConstantRange VkPushConstantRange} const * {@link #pPushConstantRanges};
 * }</code></pre>
 */
public class VkIndirectExecutionSetShaderInfoEXT extends Struct<VkIndirectExecutionSetShaderInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERCOUNT,
        PINITIALSHADERS,
        PSETLAYOUTINFOS,
        MAXSHADERCOUNT,
        PUSHCONSTANTRANGECOUNT,
        PPUSHCONSTANTRANGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERCOUNT = layout.offsetof(2);
        PINITIALSHADERS = layout.offsetof(3);
        PSETLAYOUTINFOS = layout.offsetof(4);
        MAXSHADERCOUNT = layout.offsetof(5);
        PUSHCONSTANTRANGECOUNT = layout.offsetof(6);
        PPUSHCONSTANTRANGES = layout.offsetof(7);
    }

    protected VkIndirectExecutionSetShaderInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectExecutionSetShaderInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectExecutionSetShaderInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectExecutionSetShaderInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectExecutionSetShaderInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of members in the {@code pInitialShaders} and {@code pSetLayoutInfos} arrays. */
    @NativeType("uint32_t")
    public int shaderCount() { return nshaderCount(address()); }
    /** a pointer to an array containing a {@code VkShaderEXT} object for each shader stage that will be used in the set. These shaders will be automatically added to the set beginning at index 0. */
    @NativeType("VkShaderEXT const *")
    public LongBuffer pInitialShaders() { return npInitialShaders(address()); }
    /** a pointer to an array containing a {@link VkIndirectExecutionSetShaderLayoutInfoEXT} used by each corresponding {@code pInitialShaders} shader stage in the set. */
    @Nullable
    @NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *")
    public VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer pSetLayoutInfos() { return npSetLayoutInfos(address()); }
    /** the maximum number of shader objects stored in the set. */
    @NativeType("uint32_t")
    public int maxShaderCount() { return nmaxShaderCount(address()); }
    /** the number of members in the {@code pPushConstantRanges} array. */
    @NativeType("uint32_t")
    public int pushConstantRangeCount() { return npushConstantRangeCount(address()); }
    /** a pointer to the array of {@link VkPushConstantRange} ranges used by all shaders in the set. */
    @Nullable
    @NativeType("VkPushConstantRange const *")
    public VkPushConstantRange.Buffer pPushConstantRanges() { return npPushConstantRanges(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkIndirectExecutionSetShaderInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT} value to the {@link #sType} field. */
    public VkIndirectExecutionSetShaderInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkIndirectExecutionSetShaderInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderCount} field. */
    public VkIndirectExecutionSetShaderInfoEXT shaderCount(@NativeType("uint32_t") int value) { nshaderCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pInitialShaders} field. */
    public VkIndirectExecutionSetShaderInfoEXT pInitialShaders(@NativeType("VkShaderEXT const *") LongBuffer value) { npInitialShaders(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} to the {@link #pSetLayoutInfos} field. */
    public VkIndirectExecutionSetShaderInfoEXT pSetLayoutInfos(@Nullable @NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *") VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer value) { npSetLayoutInfos(address(), value); return this; }
    /** Sets the specified value to the {@link #maxShaderCount} field. */
    public VkIndirectExecutionSetShaderInfoEXT maxShaderCount(@NativeType("uint32_t") int value) { nmaxShaderCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@link #pPushConstantRanges} field. */
    public VkIndirectExecutionSetShaderInfoEXT pPushConstantRanges(@Nullable @NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) { npPushConstantRanges(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectExecutionSetShaderInfoEXT set(
        int sType,
        long pNext,
        int shaderCount,
        LongBuffer pInitialShaders,
        @Nullable VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer pSetLayoutInfos,
        int maxShaderCount,
        @Nullable VkPushConstantRange.Buffer pPushConstantRanges
    ) {
        sType(sType);
        pNext(pNext);
        shaderCount(shaderCount);
        pInitialShaders(pInitialShaders);
        pSetLayoutInfos(pSetLayoutInfos);
        maxShaderCount(maxShaderCount);
        pPushConstantRanges(pPushConstantRanges);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectExecutionSetShaderInfoEXT set(VkIndirectExecutionSetShaderInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetShaderInfoEXT malloc() {
        return new VkIndirectExecutionSetShaderInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetShaderInfoEXT calloc() {
        return new VkIndirectExecutionSetShaderInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectExecutionSetShaderInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectExecutionSetShaderInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance for the specified memory address. */
    public static VkIndirectExecutionSetShaderInfoEXT create(long address) {
        return new VkIndirectExecutionSetShaderInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectExecutionSetShaderInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectExecutionSetShaderInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetShaderInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectExecutionSetShaderInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetShaderInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectExecutionSetShaderInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkIndirectExecutionSetShaderInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PNEXT); }
    /** Unsafe version of {@link #shaderCount}. */
    public static int nshaderCount(long struct) { return memGetInt(struct + VkIndirectExecutionSetShaderInfoEXT.SHADERCOUNT); }
    /** Unsafe version of {@link #pInitialShaders() pInitialShaders}. */
    public static LongBuffer npInitialShaders(long struct) { return memLongBuffer(memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PINITIALSHADERS), nshaderCount(struct)); }
    /** Unsafe version of {@link #pSetLayoutInfos}. */
    @Nullable public static VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer npSetLayoutInfos(long struct) { return VkIndirectExecutionSetShaderLayoutInfoEXT.createSafe(memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PSETLAYOUTINFOS), nshaderCount(struct)); }
    /** Unsafe version of {@link #maxShaderCount}. */
    public static int nmaxShaderCount(long struct) { return memGetInt(struct + VkIndirectExecutionSetShaderInfoEXT.MAXSHADERCOUNT); }
    /** Unsafe version of {@link #pushConstantRangeCount}. */
    public static int npushConstantRangeCount(long struct) { return memGetInt(struct + VkIndirectExecutionSetShaderInfoEXT.PUSHCONSTANTRANGECOUNT); }
    /** Unsafe version of {@link #pPushConstantRanges}. */
    @Nullable public static VkPushConstantRange.Buffer npPushConstantRanges(long struct) { return VkPushConstantRange.createSafe(memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PPUSHCONSTANTRANGES), npushConstantRangeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetShaderInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code shaderCount} field of the specified {@code struct}. */
    public static void nshaderCount(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetShaderInfoEXT.SHADERCOUNT, value); }
    /** Unsafe version of {@link #pInitialShaders(LongBuffer) pInitialShaders}. */
    public static void npInitialShaders(long struct, LongBuffer value) { memPutAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PINITIALSHADERS, memAddress(value)); }
    /** Unsafe version of {@link #pSetLayoutInfos(VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer) pSetLayoutInfos}. */
    public static void npSetLayoutInfos(long struct, @Nullable VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer value) { memPutAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PSETLAYOUTINFOS, memAddressSafe(value)); }
    /** Unsafe version of {@link #maxShaderCount(int) maxShaderCount}. */
    public static void nmaxShaderCount(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetShaderInfoEXT.MAXSHADERCOUNT, value); }
    /** Sets the specified value to the {@code pushConstantRangeCount} field of the specified {@code struct}. */
    public static void npushConstantRangeCount(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetShaderInfoEXT.PUSHCONSTANTRANGECOUNT, value); }
    /** Unsafe version of {@link #pPushConstantRanges(VkPushConstantRange.Buffer) pPushConstantRanges}. */
    public static void npPushConstantRanges(long struct, @Nullable VkPushConstantRange.Buffer value) { memPutAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PPUSHCONSTANTRANGES, memAddressSafe(value)); npushConstantRangeCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PINITIALSHADERS));
        if (npushConstantRangeCount(struct) != 0) {
            check(memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PPUSHCONSTANTRANGES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkIndirectExecutionSetShaderInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectExecutionSetShaderInfoEXT, Buffer> implements NativeResource {

        private static final VkIndirectExecutionSetShaderInfoEXT ELEMENT_FACTORY = VkIndirectExecutionSetShaderInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectExecutionSetShaderInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectExecutionSetShaderInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectExecutionSetShaderInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkIndirectExecutionSetShaderInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectExecutionSetShaderInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkIndirectExecutionSetShaderInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectExecutionSetShaderInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkIndirectExecutionSetShaderInfoEXT#shaderCount} field. */
        @NativeType("uint32_t")
        public int shaderCount() { return VkIndirectExecutionSetShaderInfoEXT.nshaderCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkIndirectExecutionSetShaderInfoEXT#pInitialShaders} field. */
        @NativeType("VkShaderEXT const *")
        public LongBuffer pInitialShaders() { return VkIndirectExecutionSetShaderInfoEXT.npInitialShaders(address()); }
        /** @return a {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} view of the struct array pointed to by the {@link VkIndirectExecutionSetShaderInfoEXT#pSetLayoutInfos} field. */
        @Nullable
        @NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *")
        public VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer pSetLayoutInfos() { return VkIndirectExecutionSetShaderInfoEXT.npSetLayoutInfos(address()); }
        /** @return the value of the {@link VkIndirectExecutionSetShaderInfoEXT#maxShaderCount} field. */
        @NativeType("uint32_t")
        public int maxShaderCount() { return VkIndirectExecutionSetShaderInfoEXT.nmaxShaderCount(address()); }
        /** @return the value of the {@link VkIndirectExecutionSetShaderInfoEXT#pushConstantRangeCount} field. */
        @NativeType("uint32_t")
        public int pushConstantRangeCount() { return VkIndirectExecutionSetShaderInfoEXT.npushConstantRangeCount(address()); }
        /** @return a {@link VkPushConstantRange.Buffer} view of the struct array pointed to by the {@link VkIndirectExecutionSetShaderInfoEXT#pPushConstantRanges} field. */
        @Nullable
        @NativeType("VkPushConstantRange const *")
        public VkPushConstantRange.Buffer pPushConstantRanges() { return VkIndirectExecutionSetShaderInfoEXT.npPushConstantRanges(address()); }

        /** Sets the specified value to the {@link VkIndirectExecutionSetShaderInfoEXT#sType} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectExecutionSetShaderInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT} value to the {@link VkIndirectExecutionSetShaderInfoEXT#sType} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT); }
        /** Sets the specified value to the {@link VkIndirectExecutionSetShaderInfoEXT#pNext} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkIndirectExecutionSetShaderInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectExecutionSetShaderInfoEXT#shaderCount} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer shaderCount(@NativeType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.nshaderCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkIndirectExecutionSetShaderInfoEXT#pInitialShaders} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer pInitialShaders(@NativeType("VkShaderEXT const *") LongBuffer value) { VkIndirectExecutionSetShaderInfoEXT.npInitialShaders(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} to the {@link VkIndirectExecutionSetShaderInfoEXT#pSetLayoutInfos} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer pSetLayoutInfos(@Nullable @NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *") VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer value) { VkIndirectExecutionSetShaderInfoEXT.npSetLayoutInfos(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectExecutionSetShaderInfoEXT#maxShaderCount} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer maxShaderCount(@NativeType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.nmaxShaderCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@link VkIndirectExecutionSetShaderInfoEXT#pPushConstantRanges} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer pPushConstantRanges(@Nullable @NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) { VkIndirectExecutionSetShaderInfoEXT.npPushConstantRanges(address(), value); return this; }

    }

}