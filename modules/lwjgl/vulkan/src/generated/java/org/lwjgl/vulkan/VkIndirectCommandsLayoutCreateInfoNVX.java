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
 * <p>The following code illustrates some of the key flags:</p>
 * 
 * <pre><code>
 * void cmdProcessAllSequences(cmd, objectTable, indirectCommandsLayout, pIndirectCommandsTokens, sequencesCount, indexbuffer, indexbufferoffset)
 * {
 *   for (s = 0; s &lt; sequencesCount; s++)
 *   {
 *     sequence = s;
 * 
 *     if (indirectCommandsLayout.flags &amp; VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX) {
 *       sequence = incoherent_implementation_dependent_permutation[ sequence ];
 *     }
 *     if (indirectCommandsLayout.flags &amp; VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX) {
 *       sequence = indexbuffer.load_uint32( sequence * sizeof(uint32_t) + indexbufferoffset);
 *     }
 * 
 *     cmdProcessSequence( cmd, objectTable, indirectCommandsLayout, pIndirectCommandsTokens, sequence );
 *   }
 * }</code></pre>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code tokenCount} <b>must</b> be greater than 0 and below {@link VkDeviceGeneratedCommandsLimitsNVX}{@code ::maxIndirectCommandsLayoutTokenCount}</li>
 * <li>If the {@link VkDeviceGeneratedCommandsFeaturesNVX}{@code ::computeBindingPointSupport} feature is not enabled, then {@code pipelineBindPoint} <b>must</b> not be {@link VK10#VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</li>
 * <li>If {@code pTokens} contains an entry of {@link NVXDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX} it <b>must</b> be the first element of the array and there <b>must</b> be only a single element of such token type.</li>
 * <li>All state binding tokens in {@code pTokens} <b>must</b> occur prior work provoking tokens ({@link NVXDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX}, {@link NVXDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX}, {@link NVXDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX}).</li>
 * <li>The content of {@code pTokens} <b>must</b> include one single work provoking token that is compatible with the {@code pipelineBindPoint}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkIndirectCommandsLayoutUsageFlagBitsNVX} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * <li>{@code pTokens} <b>must</b> be a valid pointer to an array of {@code tokenCount} valid {@link VkIndirectCommandsLayoutTokenNVX} structures</li>
 * <li>{@code tokenCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkIndirectCommandsLayoutTokenNVX}, {@link NVXDeviceGeneratedCommands#vkCreateIndirectCommandsLayoutNVX CreateIndirectCommandsLayoutNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code pipelineBindPoint} &ndash; the {@code VkPipelineBindPoint} that this layout targets.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkIndirectCommandsLayoutUsageFlagBitsNVX} specifying usage hints of this layout.</li>
 * <li>{@code tokenCount} &ndash; the length of the individual command sequnce.</li>
 * <li>{@code pTokens} &ndash; an array describing each command token in detail. See {@code VkIndirectCommandsTokenTypeNVX} and {@link VkIndirectCommandsLayoutTokenNVX} below for details.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkIndirectCommandsLayoutCreateInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     VkIndirectCommandsLayoutUsageFlagsNVX flags;
 *     uint32_t tokenCount;
 *     {@link VkIndirectCommandsLayoutTokenNVX VkIndirectCommandsLayoutTokenNVX} const * pTokens;
 * }</code></pre>
 */
public class VkIndirectCommandsLayoutCreateInfoNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEBINDPOINT,
        FLAGS,
        TOKENCOUNT,
        PTOKENS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINDPOINT = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        TOKENCOUNT = layout.offsetof(4);
        PTOKENS = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkIndirectCommandsLayoutCreateInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsLayoutCreateInfoNVX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code pipelineBindPoint} field. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkIndirectCommandsLayoutUsageFlagsNVX")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code tokenCount} field. */
    @NativeType("uint32_t")
    public int tokenCount() { return ntokenCount(address()); }
    /** Returns a {@link VkIndirectCommandsLayoutTokenNVX.Buffer} view of the struct array pointed to by the {@code pTokens} field. */
    @NativeType("VkIndirectCommandsLayoutTokenNVX const *")
    public VkIndirectCommandsLayoutTokenNVX.Buffer pTokens() { return npTokens(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkIndirectCommandsLayoutCreateInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkIndirectCommandsLayoutCreateInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    public VkIndirectCommandsLayoutCreateInfoNVX pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkIndirectCommandsLayoutCreateInfoNVX flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsNVX") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectCommandsLayoutTokenNVX.Buffer} to the {@code pTokens} field. */
    public VkIndirectCommandsLayoutCreateInfoNVX pTokens(@NativeType("VkIndirectCommandsLayoutTokenNVX const *") VkIndirectCommandsLayoutTokenNVX.Buffer value) { npTokens(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsLayoutCreateInfoNVX set(
        int sType,
        long pNext,
        int pipelineBindPoint,
        int flags,
        VkIndirectCommandsLayoutTokenNVX.Buffer pTokens
    ) {
        sType(sType);
        pNext(pNext);
        pipelineBindPoint(pipelineBindPoint);
        flags(flags);
        pTokens(pTokens);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsLayoutCreateInfoNVX set(VkIndirectCommandsLayoutCreateInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutCreateInfoNVX malloc() {
        return wrap(VkIndirectCommandsLayoutCreateInfoNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutCreateInfoNVX calloc() {
        return wrap(VkIndirectCommandsLayoutCreateInfoNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsLayoutCreateInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkIndirectCommandsLayoutCreateInfoNVX.class, memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNVX} instance for the specified memory address. */
    public static VkIndirectCommandsLayoutCreateInfoNVX create(long address) {
        return wrap(VkIndirectCommandsLayoutCreateInfoNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectCommandsLayoutCreateInfoNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkIndirectCommandsLayoutCreateInfoNVX.class, address);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkIndirectCommandsLayoutCreateInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectCommandsLayoutCreateInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkIndirectCommandsLayoutCreateInfoNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkIndirectCommandsLayoutCreateInfoNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutCreateInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutCreateInfoNVX mallocStack(MemoryStack stack) {
        return wrap(VkIndirectCommandsLayoutCreateInfoNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutCreateInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutCreateInfoNVX callocStack(MemoryStack stack) {
        return wrap(VkIndirectCommandsLayoutCreateInfoNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutCreateInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNVX.PNEXT); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutCreateInfoNVX.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutCreateInfoNVX.FLAGS); }
    /** Unsafe version of {@link #tokenCount}. */
    public static int ntokenCount(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsLayoutCreateInfoNVX.TOKENCOUNT); }
    /** Unsafe version of {@link #pTokens}. */
    public static VkIndirectCommandsLayoutTokenNVX.Buffer npTokens(long struct) { return VkIndirectCommandsLayoutTokenNVX.create(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNVX.PTOKENS), ntokenCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutCreateInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutCreateInfoNVX.PIPELINEBINDPOINT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutCreateInfoNVX.FLAGS, value); }
    /** Sets the specified value to the {@code tokenCount} field of the specified {@code struct}. */
    public static void ntokenCount(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsLayoutCreateInfoNVX.TOKENCOUNT, value); }
    /** Unsafe version of {@link #pTokens(VkIndirectCommandsLayoutTokenNVX.Buffer) pTokens}. */
    public static void npTokens(long struct, VkIndirectCommandsLayoutTokenNVX.Buffer value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoNVX.PTOKENS, value.address()); ntokenCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNVX.PTOKENS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsLayoutCreateInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutCreateInfoNVX, Buffer> implements NativeResource {

        private static final VkIndirectCommandsLayoutCreateInfoNVX ELEMENT_FACTORY = VkIndirectCommandsLayoutCreateInfoNVX.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsLayoutCreateInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsLayoutCreateInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkIndirectCommandsLayoutCreateInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectCommandsLayoutCreateInfoNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectCommandsLayoutCreateInfoNVX.npNext(address()); }
        /** Returns the value of the {@code pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkIndirectCommandsLayoutCreateInfoNVX.npipelineBindPoint(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkIndirectCommandsLayoutUsageFlagsNVX")
        public int flags() { return VkIndirectCommandsLayoutCreateInfoNVX.nflags(address()); }
        /** Returns the value of the {@code tokenCount} field. */
        @NativeType("uint32_t")
        public int tokenCount() { return VkIndirectCommandsLayoutCreateInfoNVX.ntokenCount(address()); }
        /** Returns a {@link VkIndirectCommandsLayoutTokenNVX.Buffer} view of the struct array pointed to by the {@code pTokens} field. */
        @NativeType("VkIndirectCommandsLayoutTokenNVX const *")
        public VkIndirectCommandsLayoutTokenNVX.Buffer pTokens() { return VkIndirectCommandsLayoutCreateInfoNVX.npTokens(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkIndirectCommandsLayoutCreateInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectCommandsLayoutCreateInfoNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkIndirectCommandsLayoutCreateInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkIndirectCommandsLayoutCreateInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        public VkIndirectCommandsLayoutCreateInfoNVX.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkIndirectCommandsLayoutCreateInfoNVX.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkIndirectCommandsLayoutCreateInfoNVX.Buffer flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsNVX") int value) { VkIndirectCommandsLayoutCreateInfoNVX.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectCommandsLayoutTokenNVX.Buffer} to the {@code pTokens} field. */
        public VkIndirectCommandsLayoutCreateInfoNVX.Buffer pTokens(@NativeType("VkIndirectCommandsLayoutTokenNVX const *") VkIndirectCommandsLayoutTokenNVX.Buffer value) { VkIndirectCommandsLayoutCreateInfoNVX.npTokens(address(), value); return this; }

    }

}