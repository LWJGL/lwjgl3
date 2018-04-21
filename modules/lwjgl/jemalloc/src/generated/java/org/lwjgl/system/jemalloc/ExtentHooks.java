/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The {@code extent_hooks_t} structure comprises function pointers which are described individually below. jemalloc uses these functions to manage extent
 * lifetime, which starts off with allocation of mapped committed memory, in the simplest case followed by deallocation. However, there are performance
 * and platform reasons to retain extents for later reuse. Cleanup attempts cascade from deallocation to decommit to forced purging to lazy purging, which
 * gives the extent management functions opportunities to reject the most permanent cleanup operations in favor of less permanent (and often less costly)
 * operations. All operations except allocation can be universally opted out of by setting the hook pointers to {@code NULL}, or selectively opted out of by
 * returning failure.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code alloc} &ndash; the extent allocation hook</li>
 * <li>{@code dalloc} &ndash; the extent deallocation hook</li>
 * <li>{@code destroy} &ndash; the extent destruction hook</li>
 * <li>{@code commit} &ndash; the extent commit hook</li>
 * <li>{@code decommit} &ndash; the extent decommit hook</li>
 * <li>{@code purge_lazy} &ndash; the extent lazy purge hook</li>
 * <li>{@code purge_forced} &ndash; the extent forced purge hook</li>
 * <li>{@code split} &ndash; the extent split hook</li>
 * <li>{@code merge} &ndash; the extent merge hook</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct extent_hooks_t {
 *     {@link ExtentAllocI extent_alloc_t} alloc;
 *     {@link ExtentDallocI extent_dalloc_t} dalloc;
 *     {@link ExtentDestroyI extent_destroy_t} destroy;
 *     {@link ExtentCommitI extent_commit_t} commit;
 *     {@link ExtentDecommitI extent_decommit_t} decommit;
 *     {@link ExtentPurgeI extent_purge_t} purge_lazy;
 *     {@link ExtentPurgeI extent_purge_t} purge_forced;
 *     {@link ExtentSplitI extent_split_t} split;
 *     {@link ExtentMergeI extent_merge_t} merge;
 * }</pre></code>
 */
@NativeType("struct extent_hooks_t")
public class ExtentHooks extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOC,
        DALLOC,
        DESTROY,
        COMMIT,
        DECOMMIT,
        PURGE_LAZY,
        PURGE_FORCED,
        SPLIT,
        MERGE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOC = layout.offsetof(0);
        DALLOC = layout.offsetof(1);
        DESTROY = layout.offsetof(2);
        COMMIT = layout.offsetof(3);
        DECOMMIT = layout.offsetof(4);
        PURGE_LAZY = layout.offsetof(5);
        PURGE_FORCED = layout.offsetof(6);
        SPLIT = layout.offsetof(7);
        MERGE = layout.offsetof(8);
    }

    ExtentHooks(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link ExtentHooks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExtentHooks(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code alloc} field. */
    @NativeType("extent_alloc_t")
    public ExtentAlloc alloc() { return nalloc(address()); }
    /** Returns the value of the {@code dalloc} field. */
    @Nullable
    @NativeType("extent_dalloc_t")
    public ExtentDalloc dalloc() { return ndalloc(address()); }
    /** Returns the value of the {@code destroy} field. */
    @Nullable
    @NativeType("extent_destroy_t")
    public ExtentDestroy destroy() { return ndestroy(address()); }
    /** Returns the value of the {@code commit} field. */
    @Nullable
    @NativeType("extent_commit_t")
    public ExtentCommit commit() { return ncommit(address()); }
    /** Returns the value of the {@code decommit} field. */
    @Nullable
    @NativeType("extent_decommit_t")
    public ExtentDecommit decommit() { return ndecommit(address()); }
    /** Returns the value of the {@code purge_lazy} field. */
    @Nullable
    @NativeType("extent_purge_t")
    public ExtentPurge purge_lazy() { return npurge_lazy(address()); }
    /** Returns the value of the {@code purge_forced} field. */
    @Nullable
    @NativeType("extent_purge_t")
    public ExtentPurge purge_forced() { return npurge_forced(address()); }
    /** Returns the value of the {@code split} field. */
    @Nullable
    @NativeType("extent_split_t")
    public ExtentSplit split() { return nsplit(address()); }
    /** Returns the value of the {@code merge} field. */
    @Nullable
    @NativeType("extent_merge_t")
    public ExtentMerge merge() { return nmerge(address()); }

    /** Sets the specified value to the {@code alloc} field. */
    public ExtentHooks alloc(@NativeType("extent_alloc_t") ExtentAllocI value) { nalloc(address(), value); return this; }
    /** Sets the specified value to the {@code dalloc} field. */
    public ExtentHooks dalloc(@Nullable @NativeType("extent_dalloc_t") ExtentDallocI value) { ndalloc(address(), value); return this; }
    /** Sets the specified value to the {@code destroy} field. */
    public ExtentHooks destroy(@Nullable @NativeType("extent_destroy_t") ExtentDestroyI value) { ndestroy(address(), value); return this; }
    /** Sets the specified value to the {@code commit} field. */
    public ExtentHooks commit(@Nullable @NativeType("extent_commit_t") ExtentCommitI value) { ncommit(address(), value); return this; }
    /** Sets the specified value to the {@code decommit} field. */
    public ExtentHooks decommit(@Nullable @NativeType("extent_decommit_t") ExtentDecommitI value) { ndecommit(address(), value); return this; }
    /** Sets the specified value to the {@code purge_lazy} field. */
    public ExtentHooks purge_lazy(@Nullable @NativeType("extent_purge_t") ExtentPurgeI value) { npurge_lazy(address(), value); return this; }
    /** Sets the specified value to the {@code purge_forced} field. */
    public ExtentHooks purge_forced(@Nullable @NativeType("extent_purge_t") ExtentPurgeI value) { npurge_forced(address(), value); return this; }
    /** Sets the specified value to the {@code split} field. */
    public ExtentHooks split(@Nullable @NativeType("extent_split_t") ExtentSplitI value) { nsplit(address(), value); return this; }
    /** Sets the specified value to the {@code merge} field. */
    public ExtentHooks merge(@Nullable @NativeType("extent_merge_t") ExtentMergeI value) { nmerge(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExtentHooks set(
        ExtentAllocI alloc,
        ExtentDallocI dalloc,
        ExtentDestroyI destroy,
        ExtentCommitI commit,
        ExtentDecommitI decommit,
        ExtentPurgeI purge_lazy,
        ExtentPurgeI purge_forced,
        ExtentSplitI split,
        ExtentMergeI merge
    ) {
        alloc(alloc);
        dalloc(dalloc);
        destroy(destroy);
        commit(commit);
        decommit(decommit);
        purge_lazy(purge_lazy);
        purge_forced(purge_forced);
        split(split);
        merge(merge);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExtentHooks set(ExtentHooks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link ExtentHooks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExtentHooks malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link ExtentHooks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExtentHooks calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link ExtentHooks} instance allocated with {@link BufferUtils}. */
    public static ExtentHooks create() {
        return new ExtentHooks(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link ExtentHooks} instance for the specified memory address. */
    public static ExtentHooks create(long address) {
        return new ExtentHooks(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ExtentHooks createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link ExtentHooks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExtentHooks.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExtentHooks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExtentHooks.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExtentHooks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExtentHooks.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link ExtentHooks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExtentHooks.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ExtentHooks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link ExtentHooks} instance allocated on the thread-local {@link MemoryStack}. */
    public static ExtentHooks mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link ExtentHooks} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ExtentHooks callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link ExtentHooks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExtentHooks mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link ExtentHooks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExtentHooks callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ExtentHooks.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ExtentHooks.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ExtentHooks.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ExtentHooks.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ExtentHooks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExtentHooks.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExtentHooks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExtentHooks.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #alloc}. */
    public static ExtentAlloc nalloc(long struct) { return ExtentAlloc.create(memGetAddress(struct + ExtentHooks.ALLOC)); }
    /** Unsafe version of {@link #dalloc}. */
    @Nullable public static ExtentDalloc ndalloc(long struct) { return ExtentDalloc.createSafe(memGetAddress(struct + ExtentHooks.DALLOC)); }
    /** Unsafe version of {@link #destroy}. */
    @Nullable public static ExtentDestroy ndestroy(long struct) { return ExtentDestroy.createSafe(memGetAddress(struct + ExtentHooks.DESTROY)); }
    /** Unsafe version of {@link #commit}. */
    @Nullable public static ExtentCommit ncommit(long struct) { return ExtentCommit.createSafe(memGetAddress(struct + ExtentHooks.COMMIT)); }
    /** Unsafe version of {@link #decommit}. */
    @Nullable public static ExtentDecommit ndecommit(long struct) { return ExtentDecommit.createSafe(memGetAddress(struct + ExtentHooks.DECOMMIT)); }
    /** Unsafe version of {@link #purge_lazy}. */
    @Nullable public static ExtentPurge npurge_lazy(long struct) { return ExtentPurge.createSafe(memGetAddress(struct + ExtentHooks.PURGE_LAZY)); }
    /** Unsafe version of {@link #purge_forced}. */
    @Nullable public static ExtentPurge npurge_forced(long struct) { return ExtentPurge.createSafe(memGetAddress(struct + ExtentHooks.PURGE_FORCED)); }
    /** Unsafe version of {@link #split}. */
    @Nullable public static ExtentSplit nsplit(long struct) { return ExtentSplit.createSafe(memGetAddress(struct + ExtentHooks.SPLIT)); }
    /** Unsafe version of {@link #merge}. */
    @Nullable public static ExtentMerge nmerge(long struct) { return ExtentMerge.createSafe(memGetAddress(struct + ExtentHooks.MERGE)); }

    /** Unsafe version of {@link #alloc(ExtentAllocI) alloc}. */
    public static void nalloc(long struct, ExtentAllocI value) { memPutAddress(struct + ExtentHooks.ALLOC, value.address()); }
    /** Unsafe version of {@link #dalloc(ExtentDallocI) dalloc}. */
    public static void ndalloc(long struct, @Nullable ExtentDallocI value) { memPutAddress(struct + ExtentHooks.DALLOC, memAddressSafe(value)); }
    /** Unsafe version of {@link #destroy(ExtentDestroyI) destroy}. */
    public static void ndestroy(long struct, @Nullable ExtentDestroyI value) { memPutAddress(struct + ExtentHooks.DESTROY, memAddressSafe(value)); }
    /** Unsafe version of {@link #commit(ExtentCommitI) commit}. */
    public static void ncommit(long struct, @Nullable ExtentCommitI value) { memPutAddress(struct + ExtentHooks.COMMIT, memAddressSafe(value)); }
    /** Unsafe version of {@link #decommit(ExtentDecommitI) decommit}. */
    public static void ndecommit(long struct, @Nullable ExtentDecommitI value) { memPutAddress(struct + ExtentHooks.DECOMMIT, memAddressSafe(value)); }
    /** Unsafe version of {@link #purge_lazy(ExtentPurgeI) purge_lazy}. */
    public static void npurge_lazy(long struct, @Nullable ExtentPurgeI value) { memPutAddress(struct + ExtentHooks.PURGE_LAZY, memAddressSafe(value)); }
    /** Unsafe version of {@link #purge_forced(ExtentPurgeI) purge_forced}. */
    public static void npurge_forced(long struct, @Nullable ExtentPurgeI value) { memPutAddress(struct + ExtentHooks.PURGE_FORCED, memAddressSafe(value)); }
    /** Unsafe version of {@link #split(ExtentSplitI) split}. */
    public static void nsplit(long struct, @Nullable ExtentSplitI value) { memPutAddress(struct + ExtentHooks.SPLIT, memAddressSafe(value)); }
    /** Unsafe version of {@link #merge(ExtentMergeI) merge}. */
    public static void nmerge(long struct, @Nullable ExtentMergeI value) { memPutAddress(struct + ExtentHooks.MERGE, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExtentHooks.ALLOC));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link ExtentHooks} structs. */
    public static class Buffer extends StructBuffer<ExtentHooks, Buffer> implements NativeResource {

        /**
         * Creates a new {@link ExtentHooks.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExtentHooks#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected ExtentHooks newInstance(long address) {
            return new ExtentHooks(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code alloc} field. */
        @NativeType("extent_alloc_t")
        public ExtentAlloc alloc() { return ExtentHooks.nalloc(address()); }
        /** Returns the value of the {@code dalloc} field. */
        @Nullable
        @NativeType("extent_dalloc_t")
        public ExtentDalloc dalloc() { return ExtentHooks.ndalloc(address()); }
        /** Returns the value of the {@code destroy} field. */
        @Nullable
        @NativeType("extent_destroy_t")
        public ExtentDestroy destroy() { return ExtentHooks.ndestroy(address()); }
        /** Returns the value of the {@code commit} field. */
        @Nullable
        @NativeType("extent_commit_t")
        public ExtentCommit commit() { return ExtentHooks.ncommit(address()); }
        /** Returns the value of the {@code decommit} field. */
        @Nullable
        @NativeType("extent_decommit_t")
        public ExtentDecommit decommit() { return ExtentHooks.ndecommit(address()); }
        /** Returns the value of the {@code purge_lazy} field. */
        @Nullable
        @NativeType("extent_purge_t")
        public ExtentPurge purge_lazy() { return ExtentHooks.npurge_lazy(address()); }
        /** Returns the value of the {@code purge_forced} field. */
        @Nullable
        @NativeType("extent_purge_t")
        public ExtentPurge purge_forced() { return ExtentHooks.npurge_forced(address()); }
        /** Returns the value of the {@code split} field. */
        @Nullable
        @NativeType("extent_split_t")
        public ExtentSplit split() { return ExtentHooks.nsplit(address()); }
        /** Returns the value of the {@code merge} field. */
        @Nullable
        @NativeType("extent_merge_t")
        public ExtentMerge merge() { return ExtentHooks.nmerge(address()); }

        /** Sets the specified value to the {@code alloc} field. */
        public ExtentHooks.Buffer alloc(@NativeType("extent_alloc_t") ExtentAllocI value) { ExtentHooks.nalloc(address(), value); return this; }
        /** Sets the specified value to the {@code dalloc} field. */
        public ExtentHooks.Buffer dalloc(@Nullable @NativeType("extent_dalloc_t") ExtentDallocI value) { ExtentHooks.ndalloc(address(), value); return this; }
        /** Sets the specified value to the {@code destroy} field. */
        public ExtentHooks.Buffer destroy(@Nullable @NativeType("extent_destroy_t") ExtentDestroyI value) { ExtentHooks.ndestroy(address(), value); return this; }
        /** Sets the specified value to the {@code commit} field. */
        public ExtentHooks.Buffer commit(@Nullable @NativeType("extent_commit_t") ExtentCommitI value) { ExtentHooks.ncommit(address(), value); return this; }
        /** Sets the specified value to the {@code decommit} field. */
        public ExtentHooks.Buffer decommit(@Nullable @NativeType("extent_decommit_t") ExtentDecommitI value) { ExtentHooks.ndecommit(address(), value); return this; }
        /** Sets the specified value to the {@code purge_lazy} field. */
        public ExtentHooks.Buffer purge_lazy(@Nullable @NativeType("extent_purge_t") ExtentPurgeI value) { ExtentHooks.npurge_lazy(address(), value); return this; }
        /** Sets the specified value to the {@code purge_forced} field. */
        public ExtentHooks.Buffer purge_forced(@Nullable @NativeType("extent_purge_t") ExtentPurgeI value) { ExtentHooks.npurge_forced(address(), value); return this; }
        /** Sets the specified value to the {@code split} field. */
        public ExtentHooks.Buffer split(@Nullable @NativeType("extent_split_t") ExtentSplitI value) { ExtentHooks.nsplit(address(), value); return this; }
        /** Sets the specified value to the {@code merge} field. */
        public ExtentHooks.Buffer merge(@Nullable @NativeType("extent_merge_t") ExtentMergeI value) { ExtentHooks.nmerge(address(), value); return this; }

    }

}