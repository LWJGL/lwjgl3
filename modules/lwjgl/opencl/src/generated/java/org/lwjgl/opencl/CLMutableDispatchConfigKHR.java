/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct cl_mutable_dispatch_config_khr {
 *     cl_mutable_command_khr command;
 *     cl_uint num_args;
 *     cl_uint num_svm_args;
 *     cl_uint num_exec_infos;
 *     cl_uint work_dim;
 *     {@link CLMutableDispatchArgKHR cl_mutable_dispatch_arg_khr} const * arg_list;
 *     {@link CLMutableDispatchArgKHR cl_mutable_dispatch_arg_khr} const * arg_svm_list;
 *     {@link CLMutableDispatchExecInfoKHR cl_mutable_dispatch_exec_info_khr} const * exec_info_list;
 *     size_t const * global_work_offset;
 *     size_t const * global_work_size;
 *     size_t const * local_work_size;
 * }}</pre>
 */
@NativeType("struct cl_mutable_dispatch_config_khr")
public class CLMutableDispatchConfigKHR extends Struct<CLMutableDispatchConfigKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COMMAND,
        NUM_ARGS,
        NUM_SVM_ARGS,
        NUM_EXEC_INFOS,
        WORK_DIM,
        ARG_LIST,
        ARG_SVM_LIST,
        EXEC_INFO_LIST,
        GLOBAL_WORK_OFFSET,
        GLOBAL_WORK_SIZE,
        LOCAL_WORK_SIZE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COMMAND = layout.offsetof(0);
        NUM_ARGS = layout.offsetof(1);
        NUM_SVM_ARGS = layout.offsetof(2);
        NUM_EXEC_INFOS = layout.offsetof(3);
        WORK_DIM = layout.offsetof(4);
        ARG_LIST = layout.offsetof(5);
        ARG_SVM_LIST = layout.offsetof(6);
        EXEC_INFO_LIST = layout.offsetof(7);
        GLOBAL_WORK_OFFSET = layout.offsetof(8);
        GLOBAL_WORK_SIZE = layout.offsetof(9);
        LOCAL_WORK_SIZE = layout.offsetof(10);
    }

    protected CLMutableDispatchConfigKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CLMutableDispatchConfigKHR create(long address, @Nullable ByteBuffer container) {
        return new CLMutableDispatchConfigKHR(address, container);
    }

    /**
     * Creates a {@code CLMutableDispatchConfigKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLMutableDispatchConfigKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code command} field. */
    @NativeType("cl_mutable_command_khr")
    public long command() { return ncommand(address()); }
    /** @return the value of the {@code num_args} field. */
    @NativeType("cl_uint")
    public int num_args() { return nnum_args(address()); }
    /** @return the value of the {@code num_svm_args} field. */
    @NativeType("cl_uint")
    public int num_svm_args() { return nnum_svm_args(address()); }
    /** @return the value of the {@code num_exec_infos} field. */
    @NativeType("cl_uint")
    public int num_exec_infos() { return nnum_exec_infos(address()); }
    /** @return the value of the {@code work_dim} field. */
    @NativeType("cl_uint")
    public int work_dim() { return nwork_dim(address()); }
    /** @return a {@link CLMutableDispatchArgKHR.Buffer} view of the struct array pointed to by the {@code arg_list} field. */
    @NativeType("cl_mutable_dispatch_arg_khr const *")
    public CLMutableDispatchArgKHR.@Nullable Buffer arg_list() { return narg_list(address()); }
    /** @return a {@link CLMutableDispatchArgKHR.Buffer} view of the struct array pointed to by the {@code arg_svm_list} field. */
    @NativeType("cl_mutable_dispatch_arg_khr const *")
    public CLMutableDispatchArgKHR.@Nullable Buffer arg_svm_list() { return narg_svm_list(address()); }
    /** @return a {@link CLMutableDispatchExecInfoKHR.Buffer} view of the struct array pointed to by the {@code exec_info_list} field. */
    @NativeType("cl_mutable_dispatch_exec_info_khr const *")
    public CLMutableDispatchExecInfoKHR.@Nullable Buffer exec_info_list() { return nexec_info_list(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code global_work_offset} field. */
    @NativeType("size_t const *")
    public @Nullable PointerBuffer global_work_offset() { return nglobal_work_offset(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code global_work_size} field. */
    @NativeType("size_t const *")
    public @Nullable PointerBuffer global_work_size() { return nglobal_work_size(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code local_work_size} field. */
    @NativeType("size_t const *")
    public @Nullable PointerBuffer local_work_size() { return nlocal_work_size(address()); }

    /** Sets the specified value to the {@code command} field. */
    public CLMutableDispatchConfigKHR command(@NativeType("cl_mutable_command_khr") long value) { ncommand(address(), value); return this; }
    /** Sets the specified value to the {@code num_args} field. */
    public CLMutableDispatchConfigKHR num_args(@NativeType("cl_uint") int value) { nnum_args(address(), value); return this; }
    /** Sets the specified value to the {@code num_svm_args} field. */
    public CLMutableDispatchConfigKHR num_svm_args(@NativeType("cl_uint") int value) { nnum_svm_args(address(), value); return this; }
    /** Sets the specified value to the {@code num_exec_infos} field. */
    public CLMutableDispatchConfigKHR num_exec_infos(@NativeType("cl_uint") int value) { nnum_exec_infos(address(), value); return this; }
    /** Sets the specified value to the {@code work_dim} field. */
    public CLMutableDispatchConfigKHR work_dim(@NativeType("cl_uint") int value) { nwork_dim(address(), value); return this; }
    /** Sets the address of the specified {@link CLMutableDispatchArgKHR.Buffer} to the {@code arg_list} field. */
    public CLMutableDispatchConfigKHR arg_list(@NativeType("cl_mutable_dispatch_arg_khr const *") CLMutableDispatchArgKHR.@Nullable Buffer value) { narg_list(address(), value); return this; }
    /** Sets the address of the specified {@link CLMutableDispatchArgKHR.Buffer} to the {@code arg_svm_list} field. */
    public CLMutableDispatchConfigKHR arg_svm_list(@NativeType("cl_mutable_dispatch_arg_khr const *") CLMutableDispatchArgKHR.@Nullable Buffer value) { narg_svm_list(address(), value); return this; }
    /** Sets the address of the specified {@link CLMutableDispatchExecInfoKHR.Buffer} to the {@code exec_info_list} field. */
    public CLMutableDispatchConfigKHR exec_info_list(@NativeType("cl_mutable_dispatch_exec_info_khr const *") CLMutableDispatchExecInfoKHR.@Nullable Buffer value) { nexec_info_list(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code global_work_offset} field. */
    public CLMutableDispatchConfigKHR global_work_offset(@Nullable @NativeType("size_t const *") PointerBuffer value) { nglobal_work_offset(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code global_work_size} field. */
    public CLMutableDispatchConfigKHR global_work_size(@Nullable @NativeType("size_t const *") PointerBuffer value) { nglobal_work_size(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code local_work_size} field. */
    public CLMutableDispatchConfigKHR local_work_size(@Nullable @NativeType("size_t const *") PointerBuffer value) { nlocal_work_size(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CLMutableDispatchConfigKHR set(
        long command,
        int num_args,
        int num_svm_args,
        int num_exec_infos,
        int work_dim,
        CLMutableDispatchArgKHR.@Nullable Buffer arg_list,
        CLMutableDispatchArgKHR.@Nullable Buffer arg_svm_list,
        CLMutableDispatchExecInfoKHR.@Nullable Buffer exec_info_list,
        @Nullable PointerBuffer global_work_offset,
        @Nullable PointerBuffer global_work_size,
        @Nullable PointerBuffer local_work_size
    ) {
        command(command);
        num_args(num_args);
        num_svm_args(num_svm_args);
        num_exec_infos(num_exec_infos);
        work_dim(work_dim);
        arg_list(arg_list);
        arg_svm_list(arg_svm_list);
        exec_info_list(exec_info_list);
        global_work_offset(global_work_offset);
        global_work_size(global_work_size);
        local_work_size(local_work_size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLMutableDispatchConfigKHR set(CLMutableDispatchConfigKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CLMutableDispatchConfigKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLMutableDispatchConfigKHR malloc() {
        return new CLMutableDispatchConfigKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CLMutableDispatchConfigKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLMutableDispatchConfigKHR calloc() {
        return new CLMutableDispatchConfigKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CLMutableDispatchConfigKHR} instance allocated with {@link BufferUtils}. */
    public static CLMutableDispatchConfigKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CLMutableDispatchConfigKHR(memAddress(container), container);
    }

    /** Returns a new {@code CLMutableDispatchConfigKHR} instance for the specified memory address. */
    public static CLMutableDispatchConfigKHR create(long address) {
        return new CLMutableDispatchConfigKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CLMutableDispatchConfigKHR createSafe(long address) {
        return address == NULL ? null : new CLMutableDispatchConfigKHR(address, null);
    }

    /**
     * Returns a new {@link CLMutableDispatchConfigKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchConfigKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLMutableDispatchConfigKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchConfigKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLMutableDispatchConfigKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchConfigKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CLMutableDispatchConfigKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchConfigKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CLMutableDispatchConfigKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CLMutableDispatchConfigKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLMutableDispatchConfigKHR malloc(MemoryStack stack) {
        return new CLMutableDispatchConfigKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CLMutableDispatchConfigKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLMutableDispatchConfigKHR calloc(MemoryStack stack) {
        return new CLMutableDispatchConfigKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CLMutableDispatchConfigKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchConfigKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLMutableDispatchConfigKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchConfigKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #command}. */
    public static long ncommand(long struct) { return memGetAddress(struct + CLMutableDispatchConfigKHR.COMMAND); }
    /** Unsafe version of {@link #num_args}. */
    public static int nnum_args(long struct) { return memGetInt(struct + CLMutableDispatchConfigKHR.NUM_ARGS); }
    /** Unsafe version of {@link #num_svm_args}. */
    public static int nnum_svm_args(long struct) { return memGetInt(struct + CLMutableDispatchConfigKHR.NUM_SVM_ARGS); }
    /** Unsafe version of {@link #num_exec_infos}. */
    public static int nnum_exec_infos(long struct) { return memGetInt(struct + CLMutableDispatchConfigKHR.NUM_EXEC_INFOS); }
    /** Unsafe version of {@link #work_dim}. */
    public static int nwork_dim(long struct) { return memGetInt(struct + CLMutableDispatchConfigKHR.WORK_DIM); }
    /** Unsafe version of {@link #arg_list}. */
    public static CLMutableDispatchArgKHR.@Nullable Buffer narg_list(long struct) { return CLMutableDispatchArgKHR.createSafe(memGetAddress(struct + CLMutableDispatchConfigKHR.ARG_LIST), nnum_args(struct)); }
    /** Unsafe version of {@link #arg_svm_list}. */
    public static CLMutableDispatchArgKHR.@Nullable Buffer narg_svm_list(long struct) { return CLMutableDispatchArgKHR.createSafe(memGetAddress(struct + CLMutableDispatchConfigKHR.ARG_SVM_LIST), nnum_svm_args(struct)); }
    /** Unsafe version of {@link #exec_info_list}. */
    public static CLMutableDispatchExecInfoKHR.@Nullable Buffer nexec_info_list(long struct) { return CLMutableDispatchExecInfoKHR.createSafe(memGetAddress(struct + CLMutableDispatchConfigKHR.EXEC_INFO_LIST), nnum_exec_infos(struct)); }
    /** Unsafe version of {@link #global_work_offset() global_work_offset}. */
    public static @Nullable PointerBuffer nglobal_work_offset(long struct) { return memPointerBufferSafe(memGetAddress(struct + CLMutableDispatchConfigKHR.GLOBAL_WORK_OFFSET), nwork_dim(struct)); }
    /** Unsafe version of {@link #global_work_size() global_work_size}. */
    public static @Nullable PointerBuffer nglobal_work_size(long struct) { return memPointerBufferSafe(memGetAddress(struct + CLMutableDispatchConfigKHR.GLOBAL_WORK_SIZE), nwork_dim(struct)); }
    /** Unsafe version of {@link #local_work_size() local_work_size}. */
    public static @Nullable PointerBuffer nlocal_work_size(long struct) { return memPointerBufferSafe(memGetAddress(struct + CLMutableDispatchConfigKHR.LOCAL_WORK_SIZE), nwork_dim(struct)); }

    /** Unsafe version of {@link #command(long) command}. */
    public static void ncommand(long struct, long value) { memPutAddress(struct + CLMutableDispatchConfigKHR.COMMAND, check(value)); }
    /** Sets the specified value to the {@code num_args} field of the specified {@code struct}. */
    public static void nnum_args(long struct, int value) { memPutInt(struct + CLMutableDispatchConfigKHR.NUM_ARGS, value); }
    /** Sets the specified value to the {@code num_svm_args} field of the specified {@code struct}. */
    public static void nnum_svm_args(long struct, int value) { memPutInt(struct + CLMutableDispatchConfigKHR.NUM_SVM_ARGS, value); }
    /** Sets the specified value to the {@code num_exec_infos} field of the specified {@code struct}. */
    public static void nnum_exec_infos(long struct, int value) { memPutInt(struct + CLMutableDispatchConfigKHR.NUM_EXEC_INFOS, value); }
    /** Unsafe version of {@link #work_dim(int) work_dim}. */
    public static void nwork_dim(long struct, int value) { memPutInt(struct + CLMutableDispatchConfigKHR.WORK_DIM, value); }
    /** Unsafe version of {@link #arg_list(CLMutableDispatchArgKHR.Buffer) arg_list}. */
    public static void narg_list(long struct, CLMutableDispatchArgKHR.@Nullable Buffer value) { memPutAddress(struct + CLMutableDispatchConfigKHR.ARG_LIST, memAddressSafe(value)); nnum_args(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #arg_svm_list(CLMutableDispatchArgKHR.Buffer) arg_svm_list}. */
    public static void narg_svm_list(long struct, CLMutableDispatchArgKHR.@Nullable Buffer value) { memPutAddress(struct + CLMutableDispatchConfigKHR.ARG_SVM_LIST, memAddressSafe(value)); nnum_svm_args(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #exec_info_list(CLMutableDispatchExecInfoKHR.Buffer) exec_info_list}. */
    public static void nexec_info_list(long struct, CLMutableDispatchExecInfoKHR.@Nullable Buffer value) { memPutAddress(struct + CLMutableDispatchConfigKHR.EXEC_INFO_LIST, memAddressSafe(value)); nnum_exec_infos(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #global_work_offset(PointerBuffer) global_work_offset}. */
    public static void nglobal_work_offset(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + CLMutableDispatchConfigKHR.GLOBAL_WORK_OFFSET, memAddressSafe(value)); }
    /** Unsafe version of {@link #global_work_size(PointerBuffer) global_work_size}. */
    public static void nglobal_work_size(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + CLMutableDispatchConfigKHR.GLOBAL_WORK_SIZE, memAddressSafe(value)); }
    /** Unsafe version of {@link #local_work_size(PointerBuffer) local_work_size}. */
    public static void nlocal_work_size(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + CLMutableDispatchConfigKHR.LOCAL_WORK_SIZE, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CLMutableDispatchConfigKHR.COMMAND));
    }

    // -----------------------------------

    /** An array of {@link CLMutableDispatchConfigKHR} structs. */
    public static class Buffer extends StructBuffer<CLMutableDispatchConfigKHR, Buffer> implements NativeResource {

        private static final CLMutableDispatchConfigKHR ELEMENT_FACTORY = CLMutableDispatchConfigKHR.create(-1L);

        /**
         * Creates a new {@code CLMutableDispatchConfigKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLMutableDispatchConfigKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected CLMutableDispatchConfigKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code command} field. */
        @NativeType("cl_mutable_command_khr")
        public long command() { return CLMutableDispatchConfigKHR.ncommand(address()); }
        /** @return the value of the {@code num_args} field. */
        @NativeType("cl_uint")
        public int num_args() { return CLMutableDispatchConfigKHR.nnum_args(address()); }
        /** @return the value of the {@code num_svm_args} field. */
        @NativeType("cl_uint")
        public int num_svm_args() { return CLMutableDispatchConfigKHR.nnum_svm_args(address()); }
        /** @return the value of the {@code num_exec_infos} field. */
        @NativeType("cl_uint")
        public int num_exec_infos() { return CLMutableDispatchConfigKHR.nnum_exec_infos(address()); }
        /** @return the value of the {@code work_dim} field. */
        @NativeType("cl_uint")
        public int work_dim() { return CLMutableDispatchConfigKHR.nwork_dim(address()); }
        /** @return a {@link CLMutableDispatchArgKHR.Buffer} view of the struct array pointed to by the {@code arg_list} field. */
        @NativeType("cl_mutable_dispatch_arg_khr const *")
        public CLMutableDispatchArgKHR.@Nullable Buffer arg_list() { return CLMutableDispatchConfigKHR.narg_list(address()); }
        /** @return a {@link CLMutableDispatchArgKHR.Buffer} view of the struct array pointed to by the {@code arg_svm_list} field. */
        @NativeType("cl_mutable_dispatch_arg_khr const *")
        public CLMutableDispatchArgKHR.@Nullable Buffer arg_svm_list() { return CLMutableDispatchConfigKHR.narg_svm_list(address()); }
        /** @return a {@link CLMutableDispatchExecInfoKHR.Buffer} view of the struct array pointed to by the {@code exec_info_list} field. */
        @NativeType("cl_mutable_dispatch_exec_info_khr const *")
        public CLMutableDispatchExecInfoKHR.@Nullable Buffer exec_info_list() { return CLMutableDispatchConfigKHR.nexec_info_list(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code global_work_offset} field. */
        @NativeType("size_t const *")
        public @Nullable PointerBuffer global_work_offset() { return CLMutableDispatchConfigKHR.nglobal_work_offset(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code global_work_size} field. */
        @NativeType("size_t const *")
        public @Nullable PointerBuffer global_work_size() { return CLMutableDispatchConfigKHR.nglobal_work_size(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code local_work_size} field. */
        @NativeType("size_t const *")
        public @Nullable PointerBuffer local_work_size() { return CLMutableDispatchConfigKHR.nlocal_work_size(address()); }

        /** Sets the specified value to the {@code command} field. */
        public CLMutableDispatchConfigKHR.Buffer command(@NativeType("cl_mutable_command_khr") long value) { CLMutableDispatchConfigKHR.ncommand(address(), value); return this; }
        /** Sets the specified value to the {@code num_args} field. */
        public CLMutableDispatchConfigKHR.Buffer num_args(@NativeType("cl_uint") int value) { CLMutableDispatchConfigKHR.nnum_args(address(), value); return this; }
        /** Sets the specified value to the {@code num_svm_args} field. */
        public CLMutableDispatchConfigKHR.Buffer num_svm_args(@NativeType("cl_uint") int value) { CLMutableDispatchConfigKHR.nnum_svm_args(address(), value); return this; }
        /** Sets the specified value to the {@code num_exec_infos} field. */
        public CLMutableDispatchConfigKHR.Buffer num_exec_infos(@NativeType("cl_uint") int value) { CLMutableDispatchConfigKHR.nnum_exec_infos(address(), value); return this; }
        /** Sets the specified value to the {@code work_dim} field. */
        public CLMutableDispatchConfigKHR.Buffer work_dim(@NativeType("cl_uint") int value) { CLMutableDispatchConfigKHR.nwork_dim(address(), value); return this; }
        /** Sets the address of the specified {@link CLMutableDispatchArgKHR.Buffer} to the {@code arg_list} field. */
        public CLMutableDispatchConfigKHR.Buffer arg_list(@NativeType("cl_mutable_dispatch_arg_khr const *") CLMutableDispatchArgKHR.@Nullable Buffer value) { CLMutableDispatchConfigKHR.narg_list(address(), value); return this; }
        /** Sets the address of the specified {@link CLMutableDispatchArgKHR.Buffer} to the {@code arg_svm_list} field. */
        public CLMutableDispatchConfigKHR.Buffer arg_svm_list(@NativeType("cl_mutable_dispatch_arg_khr const *") CLMutableDispatchArgKHR.@Nullable Buffer value) { CLMutableDispatchConfigKHR.narg_svm_list(address(), value); return this; }
        /** Sets the address of the specified {@link CLMutableDispatchExecInfoKHR.Buffer} to the {@code exec_info_list} field. */
        public CLMutableDispatchConfigKHR.Buffer exec_info_list(@NativeType("cl_mutable_dispatch_exec_info_khr const *") CLMutableDispatchExecInfoKHR.@Nullable Buffer value) { CLMutableDispatchConfigKHR.nexec_info_list(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code global_work_offset} field. */
        public CLMutableDispatchConfigKHR.Buffer global_work_offset(@Nullable @NativeType("size_t const *") PointerBuffer value) { CLMutableDispatchConfigKHR.nglobal_work_offset(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code global_work_size} field. */
        public CLMutableDispatchConfigKHR.Buffer global_work_size(@Nullable @NativeType("size_t const *") PointerBuffer value) { CLMutableDispatchConfigKHR.nglobal_work_size(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code local_work_size} field. */
        public CLMutableDispatchConfigKHR.Buffer local_work_size(@Nullable @NativeType("size_t const *") PointerBuffer value) { CLMutableDispatchConfigKHR.nlocal_work_size(address(), value); return this; }

    }

}