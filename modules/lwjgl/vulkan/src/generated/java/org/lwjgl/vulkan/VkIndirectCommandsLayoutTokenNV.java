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
 * Struct specifying the details of an indirect command layout token.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code stream} <b>must</b> be smaller than {@link VkIndirectCommandsLayoutCreateInfoNV}{@code ::streamCount}</li>
 * <li>{@code offset} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::maxIndirectCommandsTokenOffset}</li>
 * <li>If {@code tokenType} is {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV}, {@code vertexBindingUnit} <b>must</b> stay within device supported limits for the appropriate commands</li>
 * <li>If {@code tokenType} is {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV}, {@code pushconstantPipelineLayout} <b>must</b> be valid</li>
 * <li>If {@code tokenType} is {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV}, {@code pushconstantOffset} <b>must</b> be a multiple of 4</li>
 * <li>If {@code tokenType} is {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV}, {@code pushconstantSize} <b>must</b> be a multiple of 4</li>
 * <li>If {@code tokenType} is {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV}, {@code pushconstantOffset} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize}</li>
 * <li>If {@code tokenType} is {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV}, {@code pushconstantSize} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize} minus {@code pushconstantOffset}</li>
 * <li>If {@code tokenType} is {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV}, for each byte in the range specified by {@code pushconstantOffset} and {@code pushconstantSize} and for each shader stage in {@code pushconstantShaderStageFlags}, there <b>must</b> be a push constant range in {@code pushconstantPipelineLayout} that includes that byte and that stage</li>
 * <li>If {@code tokenType} is {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV}, for each byte in the range specified by {@code pushconstantOffset} and {@code pushconstantSize} and for each push constant range that overlaps that byte, {@code pushconstantShaderStageFlags} <b>must</b> include all stages in that push constant range’s {@link VkPushConstantRange}{@code ::stageFlags}</li>
 * <li>If {@code tokenType} is {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV}, {@code indirectStateFlags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code tokenType} <b>must</b> be a valid {@code VkIndirectCommandsTokenTypeNV} value</li>
 * <li>If {@code pushconstantPipelineLayout} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pushconstantPipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code pushconstantShaderStageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * <li>{@code indirectStateFlags} <b>must</b> be a valid combination of {@code VkIndirectStateFlagBitsNV} values</li>
 * <li>If {@code indexTypeCount} is not 0, {@code pIndexTypes} <b>must</b> be a valid pointer to an array of {@code indexTypeCount} valid {@code VkIndexType} values</li>
 * <li>If {@code indexTypeCount} is not 0, {@code pIndexTypeValues} <b>must</b> be a valid pointer to an array of {@code indexTypeCount} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkIndirectCommandsLayoutCreateInfoNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkIndirectCommandsLayoutTokenNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkIndirectCommandsTokenTypeNV {@link #tokenType};
 *     uint32_t {@link #stream$ stream};
 *     uint32_t {@link #offset};
 *     uint32_t {@link #vertexBindingUnit};
 *     VkBool32 {@link #vertexDynamicStride};
 *     VkPipelineLayout {@link #pushconstantPipelineLayout};
 *     VkShaderStageFlags {@link #pushconstantShaderStageFlags};
 *     uint32_t {@link #pushconstantOffset};
 *     uint32_t {@link #pushconstantSize};
 *     VkIndirectStateFlagsNV {@link #indirectStateFlags};
 *     uint32_t {@link #indexTypeCount};
 *     VkIndexType const * {@link #pIndexTypes};
 *     uint32_t const * pIndexTypeValues;
 * }</code></pre>
 */
public class VkIndirectCommandsLayoutTokenNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TOKENTYPE,
        STREAM,
        OFFSET,
        VERTEXBINDINGUNIT,
        VERTEXDYNAMICSTRIDE,
        PUSHCONSTANTPIPELINELAYOUT,
        PUSHCONSTANTSHADERSTAGEFLAGS,
        PUSHCONSTANTOFFSET,
        PUSHCONSTANTSIZE,
        INDIRECTSTATEFLAGS,
        INDEXTYPECOUNT,
        PINDEXTYPES,
        PINDEXTYPEVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TOKENTYPE = layout.offsetof(2);
        STREAM = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        VERTEXBINDINGUNIT = layout.offsetof(5);
        VERTEXDYNAMICSTRIDE = layout.offsetof(6);
        PUSHCONSTANTPIPELINELAYOUT = layout.offsetof(7);
        PUSHCONSTANTSHADERSTAGEFLAGS = layout.offsetof(8);
        PUSHCONSTANTOFFSET = layout.offsetof(9);
        PUSHCONSTANTSIZE = layout.offsetof(10);
        INDIRECTSTATEFLAGS = layout.offsetof(11);
        INDEXTYPECOUNT = layout.offsetof(12);
        PINDEXTYPES = layout.offsetof(13);
        PINDEXTYPEVALUES = layout.offsetof(14);
    }

    /**
     * Creates a {@code VkIndirectCommandsLayoutTokenNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsLayoutTokenNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** specifies the token command type. */
    @NativeType("VkIndirectCommandsTokenTypeNV")
    public int tokenType() { return ntokenType(address()); }
    /** the index of the input stream containing the token argument data. */
    @NativeType("uint32_t")
    public int stream$() { return nstream$(address()); }
    /** a relative starting offset within the input stream memory for the token argument data. */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }
    /** used for the vertex buffer binding command. */
    @NativeType("uint32_t")
    public int vertexBindingUnit() { return nvertexBindingUnit(address()); }
    /** sets if the vertex buffer stride is provided by the binding command rather than the current bound graphics pipeline state. */
    @NativeType("VkBool32")
    public boolean vertexDynamicStride() { return nvertexDynamicStride(address()) != 0; }
    /** the {@code VkPipelineLayout} used for the push constant command. */
    @NativeType("VkPipelineLayout")
    public long pushconstantPipelineLayout() { return npushconstantPipelineLayout(address()); }
    /** are the shader stage flags used for the push constant command. */
    @NativeType("VkShaderStageFlags")
    public int pushconstantShaderStageFlags() { return npushconstantShaderStageFlags(address()); }
    /** the offset used for the push constant command. */
    @NativeType("uint32_t")
    public int pushconstantOffset() { return npushconstantOffset(address()); }
    /** the size used for the push constant command. */
    @NativeType("uint32_t")
    public int pushconstantSize() { return npushconstantSize(address()); }
    /** are the active states for the state flag command. */
    @NativeType("VkIndirectStateFlagsNV")
    public int indirectStateFlags() { return nindirectStateFlags(address()); }
    /** the optional size of the {@code pIndexTypes} and {@code pIndexTypeValues} array pairings. If not zero, it allows to register a custom {@code uint32_t} value to be treated as specific {@code VkIndexType}. */
    @NativeType("uint32_t")
    public int indexTypeCount() { return nindexTypeCount(address()); }
    /** the used {@code VkIndexType} for the corresponding {@code uint32_t} value entry in {@code pIndexTypeValues}. */
    @Nullable
    @NativeType("VkIndexType const *")
    public IntBuffer pIndexTypes() { return npIndexTypes(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pIndexTypeValues} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pIndexTypeValues() { return npIndexTypeValues(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkIndirectCommandsLayoutTokenNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV} value to the {@link #sType} field. */
    public VkIndirectCommandsLayoutTokenNV sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkIndirectCommandsLayoutTokenNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #tokenType} field. */
    public VkIndirectCommandsLayoutTokenNV tokenType(@NativeType("VkIndirectCommandsTokenTypeNV") int value) { ntokenType(address(), value); return this; }
    /** Sets the specified value to the {@link #stream$} field. */
    public VkIndirectCommandsLayoutTokenNV stream$(@NativeType("uint32_t") int value) { nstream$(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public VkIndirectCommandsLayoutTokenNV offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexBindingUnit} field. */
    public VkIndirectCommandsLayoutTokenNV vertexBindingUnit(@NativeType("uint32_t") int value) { nvertexBindingUnit(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexDynamicStride} field. */
    public VkIndirectCommandsLayoutTokenNV vertexDynamicStride(@NativeType("VkBool32") boolean value) { nvertexDynamicStride(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #pushconstantPipelineLayout} field. */
    public VkIndirectCommandsLayoutTokenNV pushconstantPipelineLayout(@NativeType("VkPipelineLayout") long value) { npushconstantPipelineLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #pushconstantShaderStageFlags} field. */
    public VkIndirectCommandsLayoutTokenNV pushconstantShaderStageFlags(@NativeType("VkShaderStageFlags") int value) { npushconstantShaderStageFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #pushconstantOffset} field. */
    public VkIndirectCommandsLayoutTokenNV pushconstantOffset(@NativeType("uint32_t") int value) { npushconstantOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #pushconstantSize} field. */
    public VkIndirectCommandsLayoutTokenNV pushconstantSize(@NativeType("uint32_t") int value) { npushconstantSize(address(), value); return this; }
    /** Sets the specified value to the {@link #indirectStateFlags} field. */
    public VkIndirectCommandsLayoutTokenNV indirectStateFlags(@NativeType("VkIndirectStateFlagsNV") int value) { nindirectStateFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #indexTypeCount} field. */
    public VkIndirectCommandsLayoutTokenNV indexTypeCount(@NativeType("uint32_t") int value) { nindexTypeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pIndexTypes} field. */
    public VkIndirectCommandsLayoutTokenNV pIndexTypes(@Nullable @NativeType("VkIndexType const *") IntBuffer value) { npIndexTypes(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pIndexTypeValues} field. */
    public VkIndirectCommandsLayoutTokenNV pIndexTypeValues(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npIndexTypeValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsLayoutTokenNV set(
        int sType,
        long pNext,
        int tokenType,
        int stream$,
        int offset,
        int vertexBindingUnit,
        boolean vertexDynamicStride,
        long pushconstantPipelineLayout,
        int pushconstantShaderStageFlags,
        int pushconstantOffset,
        int pushconstantSize,
        int indirectStateFlags,
        int indexTypeCount,
        @Nullable IntBuffer pIndexTypes,
        @Nullable IntBuffer pIndexTypeValues
    ) {
        sType(sType);
        pNext(pNext);
        tokenType(tokenType);
        stream$(stream$);
        offset(offset);
        vertexBindingUnit(vertexBindingUnit);
        vertexDynamicStride(vertexDynamicStride);
        pushconstantPipelineLayout(pushconstantPipelineLayout);
        pushconstantShaderStageFlags(pushconstantShaderStageFlags);
        pushconstantOffset(pushconstantOffset);
        pushconstantSize(pushconstantSize);
        indirectStateFlags(indirectStateFlags);
        indexTypeCount(indexTypeCount);
        pIndexTypes(pIndexTypes);
        pIndexTypeValues(pIndexTypeValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsLayoutTokenNV set(VkIndirectCommandsLayoutTokenNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutTokenNV malloc() {
        return wrap(VkIndirectCommandsLayoutTokenNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutTokenNV calloc() {
        return wrap(VkIndirectCommandsLayoutTokenNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsLayoutTokenNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkIndirectCommandsLayoutTokenNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance for the specified memory address. */
    public static VkIndirectCommandsLayoutTokenNV create(long address) {
        return wrap(VkIndirectCommandsLayoutTokenNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectCommandsLayoutTokenNV createSafe(long address) {
        return address == NULL ? null : wrap(VkIndirectCommandsLayoutTokenNV.class, address);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectCommandsLayoutTokenNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutTokenNV malloc(MemoryStack stack) {
        return wrap(VkIndirectCommandsLayoutTokenNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutTokenNV calloc(MemoryStack stack) {
        return wrap(VkIndirectCommandsLayoutTokenNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutTokenNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectCommandsLayoutTokenNV.PNEXT); }
    /** Unsafe version of {@link #tokenType}. */
    public static int ntokenType(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutTokenNV.TOKENTYPE); }
    /** Unsafe version of {@link #stream$}. */
    public static int nstream$(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutTokenNV.STREAM); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutTokenNV.OFFSET); }
    /** Unsafe version of {@link #vertexBindingUnit}. */
    public static int nvertexBindingUnit(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutTokenNV.VERTEXBINDINGUNIT); }
    /** Unsafe version of {@link #vertexDynamicStride}. */
    public static int nvertexDynamicStride(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutTokenNV.VERTEXDYNAMICSTRIDE); }
    /** Unsafe version of {@link #pushconstantPipelineLayout}. */
    public static long npushconstantPipelineLayout(long struct) { return UNSAFE.getLong(null, struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTPIPELINELAYOUT); }
    /** Unsafe version of {@link #pushconstantShaderStageFlags}. */
    public static int npushconstantShaderStageFlags(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSHADERSTAGEFLAGS); }
    /** Unsafe version of {@link #pushconstantOffset}. */
    public static int npushconstantOffset(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTOFFSET); }
    /** Unsafe version of {@link #pushconstantSize}. */
    public static int npushconstantSize(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSIZE); }
    /** Unsafe version of {@link #indirectStateFlags}. */
    public static int nindirectStateFlags(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutTokenNV.INDIRECTSTATEFLAGS); }
    /** Unsafe version of {@link #indexTypeCount}. */
    public static int nindexTypeCount(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutTokenNV.INDEXTYPECOUNT); }
    /** Unsafe version of {@link #pIndexTypes() pIndexTypes}. */
    @Nullable public static IntBuffer npIndexTypes(long struct) { return memIntBufferSafe(memGetAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPES), nindexTypeCount(struct)); }
    /** Unsafe version of {@link #pIndexTypeValues() pIndexTypeValues}. */
    @Nullable public static IntBuffer npIndexTypeValues(long struct) { return memIntBufferSafe(memGetAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPEVALUES), nindexTypeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutTokenNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectCommandsLayoutTokenNV.PNEXT, value); }
    /** Unsafe version of {@link #tokenType(int) tokenType}. */
    public static void ntokenType(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutTokenNV.TOKENTYPE, value); }
    /** Unsafe version of {@link #stream$(int) stream$}. */
    public static void nstream$(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutTokenNV.STREAM, value); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutTokenNV.OFFSET, value); }
    /** Unsafe version of {@link #vertexBindingUnit(int) vertexBindingUnit}. */
    public static void nvertexBindingUnit(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutTokenNV.VERTEXBINDINGUNIT, value); }
    /** Unsafe version of {@link #vertexDynamicStride(boolean) vertexDynamicStride}. */
    public static void nvertexDynamicStride(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutTokenNV.VERTEXDYNAMICSTRIDE, value); }
    /** Unsafe version of {@link #pushconstantPipelineLayout(long) pushconstantPipelineLayout}. */
    public static void npushconstantPipelineLayout(long struct, long value) { UNSAFE.putLong(null, struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTPIPELINELAYOUT, value); }
    /** Unsafe version of {@link #pushconstantShaderStageFlags(int) pushconstantShaderStageFlags}. */
    public static void npushconstantShaderStageFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSHADERSTAGEFLAGS, value); }
    /** Unsafe version of {@link #pushconstantOffset(int) pushconstantOffset}. */
    public static void npushconstantOffset(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTOFFSET, value); }
    /** Unsafe version of {@link #pushconstantSize(int) pushconstantSize}. */
    public static void npushconstantSize(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSIZE, value); }
    /** Unsafe version of {@link #indirectStateFlags(int) indirectStateFlags}. */
    public static void nindirectStateFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutTokenNV.INDIRECTSTATEFLAGS, value); }
    /** Sets the specified value to the {@code indexTypeCount} field of the specified {@code struct}. */
    public static void nindexTypeCount(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutTokenNV.INDEXTYPECOUNT, value); }
    /** Unsafe version of {@link #pIndexTypes(IntBuffer) pIndexTypes}. */
    public static void npIndexTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPES, memAddressSafe(value)); }
    /** Unsafe version of {@link #pIndexTypeValues(IntBuffer) pIndexTypeValues}. */
    public static void npIndexTypeValues(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPEVALUES, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nindexTypeCount(struct) != 0) {
            check(memGetAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPES));
            check(memGetAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPEVALUES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsLayoutTokenNV} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutTokenNV, Buffer> implements NativeResource {

        private static final VkIndirectCommandsLayoutTokenNV ELEMENT_FACTORY = VkIndirectCommandsLayoutTokenNV.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsLayoutTokenNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsLayoutTokenNV#SIZEOF}, and its mark will be undefined.
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
        protected VkIndirectCommandsLayoutTokenNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectCommandsLayoutTokenNV.nsType(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectCommandsLayoutTokenNV.npNext(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#tokenType} field. */
        @NativeType("VkIndirectCommandsTokenTypeNV")
        public int tokenType() { return VkIndirectCommandsLayoutTokenNV.ntokenType(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#stream$} field. */
        @NativeType("uint32_t")
        public int stream$() { return VkIndirectCommandsLayoutTokenNV.nstream$(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#offset} field. */
        @NativeType("uint32_t")
        public int offset() { return VkIndirectCommandsLayoutTokenNV.noffset(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#vertexBindingUnit} field. */
        @NativeType("uint32_t")
        public int vertexBindingUnit() { return VkIndirectCommandsLayoutTokenNV.nvertexBindingUnit(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#vertexDynamicStride} field. */
        @NativeType("VkBool32")
        public boolean vertexDynamicStride() { return VkIndirectCommandsLayoutTokenNV.nvertexDynamicStride(address()) != 0; }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#pushconstantPipelineLayout} field. */
        @NativeType("VkPipelineLayout")
        public long pushconstantPipelineLayout() { return VkIndirectCommandsLayoutTokenNV.npushconstantPipelineLayout(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#pushconstantShaderStageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int pushconstantShaderStageFlags() { return VkIndirectCommandsLayoutTokenNV.npushconstantShaderStageFlags(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#pushconstantOffset} field. */
        @NativeType("uint32_t")
        public int pushconstantOffset() { return VkIndirectCommandsLayoutTokenNV.npushconstantOffset(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#pushconstantSize} field. */
        @NativeType("uint32_t")
        public int pushconstantSize() { return VkIndirectCommandsLayoutTokenNV.npushconstantSize(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#indirectStateFlags} field. */
        @NativeType("VkIndirectStateFlagsNV")
        public int indirectStateFlags() { return VkIndirectCommandsLayoutTokenNV.nindirectStateFlags(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutTokenNV#indexTypeCount} field. */
        @NativeType("uint32_t")
        public int indexTypeCount() { return VkIndirectCommandsLayoutTokenNV.nindexTypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkIndirectCommandsLayoutTokenNV#pIndexTypes} field. */
        @Nullable
        @NativeType("VkIndexType const *")
        public IntBuffer pIndexTypes() { return VkIndirectCommandsLayoutTokenNV.npIndexTypes(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pIndexTypeValues} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pIndexTypeValues() { return VkIndirectCommandsLayoutTokenNV.npIndexTypeValues(address()); }

        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#sType} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectCommandsLayoutTokenNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV} value to the {@link VkIndirectCommandsLayoutTokenNV#sType} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV); }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#pNext} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pNext(@NativeType("void const *") long value) { VkIndirectCommandsLayoutTokenNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#tokenType} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer tokenType(@NativeType("VkIndirectCommandsTokenTypeNV") int value) { VkIndirectCommandsLayoutTokenNV.ntokenType(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#stream$} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer stream$(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.nstream$(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#offset} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer offset(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.noffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#vertexBindingUnit} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer vertexBindingUnit(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.nvertexBindingUnit(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#vertexDynamicStride} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer vertexDynamicStride(@NativeType("VkBool32") boolean value) { VkIndirectCommandsLayoutTokenNV.nvertexDynamicStride(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#pushconstantPipelineLayout} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pushconstantPipelineLayout(@NativeType("VkPipelineLayout") long value) { VkIndirectCommandsLayoutTokenNV.npushconstantPipelineLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#pushconstantShaderStageFlags} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pushconstantShaderStageFlags(@NativeType("VkShaderStageFlags") int value) { VkIndirectCommandsLayoutTokenNV.npushconstantShaderStageFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#pushconstantOffset} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pushconstantOffset(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.npushconstantOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#pushconstantSize} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pushconstantSize(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.npushconstantSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#indirectStateFlags} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer indirectStateFlags(@NativeType("VkIndirectStateFlagsNV") int value) { VkIndirectCommandsLayoutTokenNV.nindirectStateFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutTokenNV#indexTypeCount} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer indexTypeCount(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.nindexTypeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkIndirectCommandsLayoutTokenNV#pIndexTypes} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pIndexTypes(@Nullable @NativeType("VkIndexType const *") IntBuffer value) { VkIndirectCommandsLayoutTokenNV.npIndexTypes(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pIndexTypeValues} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pIndexTypeValues(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkIndirectCommandsLayoutTokenNV.npIndexTypeValues(address(), value); return this; }

    }

}