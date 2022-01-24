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
 * Structure specifying the parameters of a newly created indirect commands layout object.
 * 
 * <h5>Description</h5>
 * 
 * <p>The following code illustrates some of the flags:</p>
 * 
 * <pre><code>
 * void cmdProcessAllSequences(cmd, pipeline, indirectCommandsLayout, pIndirectCommandsTokens, sequencesCount, indexbuffer, indexbufferOffset)
 * {
 *   for (s = 0; s &lt; sequencesCount; s++)
 *   {
 *     sUsed = s;
 * 
 *     if (indirectCommandsLayout.flags &amp; VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV) {
 *       sUsed = indexbuffer.load_uint32( sUsed * sizeof(uint32_t) + indexbufferOffset);
 *     }
 * 
 *     if (indirectCommandsLayout.flags &amp; VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NV) {
 *       sUsed = incoherent_implementation_dependent_permutation[ sUsed ];
 *     }
 * 
 *     cmdProcessSequence( cmd, pipeline, indirectCommandsLayout, pIndirectCommandsTokens, sUsed );
 *   }
 * }</code></pre>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code pipelineBindPoint} <b>must</b> be {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
 * <li>{@code tokenCount} <b>must</b> be greater than 0 and less than or equal to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::maxIndirectCommandsTokenCount}</li>
 * <li>If {@code pTokens} contains an entry of {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV} it <b>must</b> be the first element of the array and there <b>must</b> be only a single element of such token type</li>
 * <li>If {@code pTokens} contains an entry of {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV} there <b>must</b> be only a single element of such token type</li>
 * <li>All state tokens in {@code pTokens} <b>must</b> occur prior work provoking tokens ({@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV}, {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV}, {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV})</li>
 * <li>The content of {@code pTokens} <b>must</b> include one single work provoking token that is compatible with the {@code pipelineBindPoint}</li>
 * <li>{@code streamCount} <b>must</b> be greater than 0 and less or equal to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::maxIndirectCommandsStreamCount}</li>
 * <li>each element of {@code pStreamStrides} <b>must</b> be greater than 0 and less than or equal to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::maxIndirectCommandsStreamStride}. Furthermore the alignment of each token input <b>must</b> be ensured</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkIndirectCommandsLayoutUsageFlagBitsNV} values</li>
 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
 * <li>{@code pTokens} <b>must</b> be a valid pointer to an array of {@code tokenCount} valid {@link VkIndirectCommandsLayoutTokenNV} structures</li>
 * <li>{@code pStreamStrides} <b>must</b> be a valid pointer to an array of {@code streamCount} {@code uint32_t} values</li>
 * <li>{@code tokenCount} <b>must</b> be greater than 0</li>
 * <li>{@code streamCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkIndirectCommandsLayoutTokenNV}, {@link NVDeviceGeneratedCommands#vkCreateIndirectCommandsLayoutNV CreateIndirectCommandsLayoutNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkIndirectCommandsLayoutCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkIndirectCommandsLayoutUsageFlagsNV {@link #flags};
 *     VkPipelineBindPoint {@link #pipelineBindPoint};
 *     uint32_t {@link #tokenCount};
 *     {@link VkIndirectCommandsLayoutTokenNV VkIndirectCommandsLayoutTokenNV} const * {@link #pTokens};
 *     uint32_t {@link #streamCount};
 *     uint32_t const * {@link #pStreamStrides};
 * }</code></pre>
 */
public class VkIndirectCommandsLayoutCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PIPELINEBINDPOINT,
        TOKENCOUNT,
        PTOKENS,
        STREAMCOUNT,
        PSTREAMSTRIDES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PIPELINEBINDPOINT = layout.offsetof(3);
        TOKENCOUNT = layout.offsetof(4);
        PTOKENS = layout.offsetof(5);
        STREAMCOUNT = layout.offsetof(6);
        PSTREAMSTRIDES = layout.offsetof(7);
    }

    /**
     * Creates a {@code VkIndirectCommandsLayoutCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsLayoutCreateInfoNV(ByteBuffer container) {
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
    /** a bitmask of {@code VkIndirectCommandsLayoutUsageFlagBitsNV} specifying usage hints of this layout. */
    @NativeType("VkIndirectCommandsLayoutUsageFlagsNV")
    public int flags() { return nflags(address()); }
    /** the {@code VkPipelineBindPoint} that this layout targets. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** the length of the individual command sequence. */
    @NativeType("uint32_t")
    public int tokenCount() { return ntokenCount(address()); }
    /** an array describing each command token in detail. See {@code VkIndirectCommandsTokenTypeNV} and {@link VkIndirectCommandsLayoutTokenNV} below for details. */
    @NativeType("VkIndirectCommandsLayoutTokenNV const *")
    public VkIndirectCommandsLayoutTokenNV.Buffer pTokens() { return npTokens(address()); }
    /** the number of streams used to provide the token inputs. */
    @NativeType("uint32_t")
    public int streamCount() { return nstreamCount(address()); }
    /** an array defining the byte stride for each input stream. */
    @NativeType("uint32_t const *")
    public IntBuffer pStreamStrides() { return npStreamStrides(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkIndirectCommandsLayoutCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkIndirectCommandsLayoutCreateInfoNV sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkIndirectCommandsLayoutCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkIndirectCommandsLayoutCreateInfoNV flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsNV") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineBindPoint} field. */
    public VkIndirectCommandsLayoutCreateInfoNV pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectCommandsLayoutTokenNV.Buffer} to the {@link #pTokens} field. */
    public VkIndirectCommandsLayoutCreateInfoNV pTokens(@NativeType("VkIndirectCommandsLayoutTokenNV const *") VkIndirectCommandsLayoutTokenNV.Buffer value) { npTokens(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pStreamStrides} field. */
    public VkIndirectCommandsLayoutCreateInfoNV pStreamStrides(@NativeType("uint32_t const *") IntBuffer value) { npStreamStrides(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsLayoutCreateInfoNV set(
        int sType,
        long pNext,
        int flags,
        int pipelineBindPoint,
        VkIndirectCommandsLayoutTokenNV.Buffer pTokens,
        IntBuffer pStreamStrides
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        pTokens(pTokens);
        pStreamStrides(pStreamStrides);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsLayoutCreateInfoNV set(VkIndirectCommandsLayoutCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutCreateInfoNV malloc() {
        return wrap(VkIndirectCommandsLayoutCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutCreateInfoNV calloc() {
        return wrap(VkIndirectCommandsLayoutCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsLayoutCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkIndirectCommandsLayoutCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance for the specified memory address. */
    public static VkIndirectCommandsLayoutCreateInfoNV create(long address) {
        return wrap(VkIndirectCommandsLayoutCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectCommandsLayoutCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkIndirectCommandsLayoutCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutCreateInfoNV malloc(MemoryStack stack) {
        return wrap(VkIndirectCommandsLayoutCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutCreateInfoNV calloc(MemoryStack stack) {
        return wrap(VkIndirectCommandsLayoutCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutCreateInfoNV.FLAGS); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutCreateInfoNV.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #tokenCount}. */
    public static int ntokenCount(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutCreateInfoNV.TOKENCOUNT); }
    /** Unsafe version of {@link #pTokens}. */
    public static VkIndirectCommandsLayoutTokenNV.Buffer npTokens(long struct) { return VkIndirectCommandsLayoutTokenNV.create(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PTOKENS), ntokenCount(struct)); }
    /** Unsafe version of {@link #streamCount}. */
    public static int nstreamCount(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutCreateInfoNV.STREAMCOUNT); }
    /** Unsafe version of {@link #pStreamStrides() pStreamStrides}. */
    public static IntBuffer npStreamStrides(long struct) { return memIntBuffer(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PSTREAMSTRIDES), nstreamCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutCreateInfoNV.FLAGS, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutCreateInfoNV.PIPELINEBINDPOINT, value); }
    /** Sets the specified value to the {@code tokenCount} field of the specified {@code struct}. */
    public static void ntokenCount(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutCreateInfoNV.TOKENCOUNT, value); }
    /** Unsafe version of {@link #pTokens(VkIndirectCommandsLayoutTokenNV.Buffer) pTokens}. */
    public static void npTokens(long struct, VkIndirectCommandsLayoutTokenNV.Buffer value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PTOKENS, value.address()); ntokenCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code streamCount} field of the specified {@code struct}. */
    public static void nstreamCount(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutCreateInfoNV.STREAMCOUNT, value); }
    /** Unsafe version of {@link #pStreamStrides(IntBuffer) pStreamStrides}. */
    public static void npStreamStrides(long struct, IntBuffer value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PSTREAMSTRIDES, memAddress(value)); nstreamCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int tokenCount = ntokenCount(struct);
        long pTokens = memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PTOKENS);
        check(pTokens);
        validate(pTokens, tokenCount, VkIndirectCommandsLayoutTokenNV.SIZEOF, VkIndirectCommandsLayoutTokenNV::validate);
        check(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PSTREAMSTRIDES));
    }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsLayoutCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutCreateInfoNV, Buffer> implements NativeResource {

        private static final VkIndirectCommandsLayoutCreateInfoNV ELEMENT_FACTORY = VkIndirectCommandsLayoutCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsLayoutCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkIndirectCommandsLayoutCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectCommandsLayoutCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectCommandsLayoutCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoNV#flags} field. */
        @NativeType("VkIndirectCommandsLayoutUsageFlagsNV")
        public int flags() { return VkIndirectCommandsLayoutCreateInfoNV.nflags(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoNV#pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkIndirectCommandsLayoutCreateInfoNV.npipelineBindPoint(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoNV#tokenCount} field. */
        @NativeType("uint32_t")
        public int tokenCount() { return VkIndirectCommandsLayoutCreateInfoNV.ntokenCount(address()); }
        /** @return a {@link VkIndirectCommandsLayoutTokenNV.Buffer} view of the struct array pointed to by the {@link VkIndirectCommandsLayoutCreateInfoNV#pTokens} field. */
        @NativeType("VkIndirectCommandsLayoutTokenNV const *")
        public VkIndirectCommandsLayoutTokenNV.Buffer pTokens() { return VkIndirectCommandsLayoutCreateInfoNV.npTokens(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoNV#streamCount} field. */
        @NativeType("uint32_t")
        public int streamCount() { return VkIndirectCommandsLayoutCreateInfoNV.nstreamCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkIndirectCommandsLayoutCreateInfoNV#pStreamStrides} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pStreamStrides() { return VkIndirectCommandsLayoutCreateInfoNV.npStreamStrides(address()); }

        /** Sets the specified value to the {@link VkIndirectCommandsLayoutCreateInfoNV#sType} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectCommandsLayoutCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV} value to the {@link VkIndirectCommandsLayoutCreateInfoNV#sType} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutCreateInfoNV#pNext} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkIndirectCommandsLayoutCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutCreateInfoNV#flags} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsNV") int value) { VkIndirectCommandsLayoutCreateInfoNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutCreateInfoNV#pipelineBindPoint} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkIndirectCommandsLayoutCreateInfoNV.npipelineBindPoint(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectCommandsLayoutTokenNV.Buffer} to the {@link VkIndirectCommandsLayoutCreateInfoNV#pTokens} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer pTokens(@NativeType("VkIndirectCommandsLayoutTokenNV const *") VkIndirectCommandsLayoutTokenNV.Buffer value) { VkIndirectCommandsLayoutCreateInfoNV.npTokens(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkIndirectCommandsLayoutCreateInfoNV#pStreamStrides} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer pStreamStrides(@NativeType("uint32_t const *") IntBuffer value) { VkIndirectCommandsLayoutCreateInfoNV.npStreamStrides(address(), value); return this; }

    }

}