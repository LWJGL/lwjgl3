package org.eclipse.fx.drift.internal;

import java.time.Duration;

public class GPUSyncUtil {

	public static enum WaitSyncResult {
		AREADY_SIGNALED,
		TIMEOUT_EXPIRED,
		CONDITION_SATISFIED,
		WAIT_FAILED
	}
	
	public static interface GPUSync {
		public WaitSyncResult ClientWaitSync(Duration timeout);
		public void WaitSync();
		public void Delete();
	}
	
	public static class D3DSync implements GPUSync {
		// for now this is a noop

		@Override
		public WaitSyncResult ClientWaitSync(Duration timeout) {
			return WaitSyncResult.AREADY_SIGNALED;
		}

		@Override
		public void WaitSync() {
		}

		@Override
		public void Delete() {
		}
	}
	
	public static GPUSync createFence() {
		if (GraphicsPipelineUtil.isES2()) {
			return GLSync.CreateFence();
		}
		else {
			return new D3DSync();
		}
	}
	
	public static class GLSync implements GPUSync {
		private long sync;
		
		private GLSync() {
			sync = nCreateFence();
		}
		
		private void checkSync() {
			if (sync == 0) {
				throw new RuntimeException("sync object was already deleted!");
			}
		}
		
		public static GLSync CreateFence() {
			return new GLSync();
		}
		
		public WaitSyncResult ClientWaitSync(Duration timeout) {
			checkSync();
			int r = nClientWaitSync(sync, timeout.toNanos());
			switch (r) {
			case GL_AREADY_SIGNALED: return WaitSyncResult.AREADY_SIGNALED;
			case GL_TIMEOUT_EXPIRED: return WaitSyncResult.TIMEOUT_EXPIRED;
			case GL_CONDITION_SATISFIED: return WaitSyncResult.CONDITION_SATISFIED;
			case GL_WAIT_FAILED: return WaitSyncResult.WAIT_FAILED;
			}
			System.err.println("glClientWaitSync: Unexpected result!!! " + r);
			return WaitSyncResult.WAIT_FAILED;
		}
		
		public void WaitSync() {
			checkSync();
			nWaitSync(sync);
		}
		
		public void Delete() {
			checkSync();
			nDeleteSync(sync);
			sync = 0;
		}
		
	}
	
	private static native long nCreateFence();
	private static native void nDeleteSync(long sync);
	
	private static final int GL_AREADY_SIGNALED = 0x911A;
	private static final int GL_TIMEOUT_EXPIRED = 0x911B;
	private static final int GL_CONDITION_SATISFIED = 0x911C;
	private static final int GL_WAIT_FAILED = 0x911D;
	private static native int nClientWaitSync(long sync, long timeout);
	
	private static native void nWaitSync(long sync);
}
