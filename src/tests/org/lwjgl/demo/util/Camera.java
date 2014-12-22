/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.util;

/**
 * A simple pinhole camera.
 *
 * @author Kai Burjack
 */
public class Camera {

	private float fn = 0.001f;

	private float ff = 10.0f;

	private float fl = -0.05f;

	private float fr = 0.05f;

	private float ft = 0.05f;

	private float fb = -0.05f;

	/**
	 * Whether view matrix needs to be recalculated when requested through
	 * {@link #getViewMatrix()}.
	 */
	private boolean refreshViewMatrix = true;

	/**
	 * Whether projection matrix needs to be recalculated when requested through
	 * {@link #getProjectionMatrix()}.
	 */
	private boolean refreshProjectionMatrix = true;

	private boolean refreshInverseProjectionViewMatrix = true;

	private final Vector3f position = new Vector3f(0.0f, 0.0f, 0.0f);

	private final Vector3f direction = new Vector3f(0.0f, 0.0f, -1.0f);

	private final Vector3f up = new Vector3f(0.0f, 1.0f, 0.0f);

	private final Vector3f right = new Vector3f(1.0f, 0.0f, 0.0f);

	private final Matrix4f projectionMatrix = new Matrix4f();

	private final Matrix4f viewMatrix = new Matrix4f();

	private final Matrix4f invViewProjectionMatrix = new Matrix4f();

	/**
	 * Orthographic projection is inherently different from perspective
	 * projection.
	 */
	private boolean orthographic;

	/* Cached objects reused for computations */
	private Vector3f tmp0      = new Vector3f();
	private Vector3f tmp1      = new Vector3f();
	private Vector3f tmp2      = new Vector3f();
	private Vector4f tmp3      = new Vector4f();

	public Vector3f getDirection() {
		return direction;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setDirection(Vector3f direction) {
		if ( this.direction.equals(direction) ) {
			return;
		}
		this.direction.set(direction);
		refreshViewMatrix = true;
		refreshInverseProjectionViewMatrix = true;
	}

	private void doRefreshInverseProjectionViewMatrix() {
		invViewProjectionMatrix.set(getProjectionMatrix());
		invViewProjectionMatrix.mul(getViewMatrix());
		invViewProjectionMatrix.invert();
		refreshInverseProjectionViewMatrix = false;
	}

	public Matrix4f getInverseProjectionViewMatrix() {
		if ( refreshInverseProjectionViewMatrix ) {
			doRefreshInverseProjectionViewMatrix();
		}
		return invViewProjectionMatrix;
	}

	/**
	 * Compute the world direction vector based on the given X and Y coordinates
	 * in normalized-device space.
	 *
	 * @param x   the X coordinate within [-1..1]
	 * @param y   the Y coordinate within [-1..1]
	 * @param res will contain the result
	 */
	public void getEyeRay(float x, float y, Vector3f res) {
		tmp3.set(x, y, 0.0f, 1.0f);
		getInverseProjectionViewMatrix().transform(tmp3);
		tmp3.scale(1.0f / tmp3.w);
		tmp0.set(tmp3.x, tmp3.y, tmp3.z);
		res.set(tmp0);
		res.sub(position);
	}

	/**
	 * {@inheritDoc}
	 */
	public void setLookAt(Vector3f position, Vector3f lookAt, Vector3f up) {
		setPosition(position);
		tmp0.set(up);
		tmp0.normalize();
		tmp1.set(lookAt);
		tmp1.sub(position);
		tmp1.normalize();
		setDirection(tmp1);
		/* right = direction x up */
		right.cross(tmp1, tmp0);
		right.normalize();
		/* up = right x direction */
		tmp0.cross(right, tmp1);
		setUp(tmp0);
	}

	private void doRefreshViewMatrix() {
		tmp0.set(direction);
		tmp0.normalize();
		tmp1.set(up);
		tmp1.normalize();
		/* right = direction x up */
		tmp1.cross(tmp0, tmp1);
		/* up = right x direction */
		tmp2.cross(tmp1, tmp0);
		Matrix4f m = viewMatrix;
		m.m00 = tmp1.x;
		m.m01 = tmp1.y;
		m.m02 = tmp1.z;
		m.m03 = -tmp1.x * position.x - tmp1.y * position.y - tmp1.z * position.z;
		m.m10 = tmp2.x;
		m.m11 = tmp2.y;
		m.m12 = tmp2.z;
		m.m13 = -tmp2.x * position.x - tmp2.y * position.y - tmp2.z * position.z;
		m.m20 = -tmp0.x;
		m.m21 = -tmp0.y;
		m.m22 = -tmp0.z;
		m.m23 = tmp0.x * position.x + tmp0.y * position.y + tmp0.z * position.z;
		m.m30 = 0.0f;
		m.m31 = 0.0f;
		m.m32 = 0.0f;
		m.m33 = 1.0f;
		refreshViewMatrix = false;
	}

	public Vector3f getPosition() {
		return position;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setPosition(Vector3f position) {
		if ( this.position.equals(position) ) {
			return;
		}
		this.position.set(position);
		refreshViewMatrix = true;
		refreshInverseProjectionViewMatrix = true;
	}

	public Vector3f getUp() {
		return up;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setUp(Vector3f up) {
		if ( this.up.equals(up) ) {
			return;
		}
		this.up.set(up);
		refreshViewMatrix = true;
		refreshInverseProjectionViewMatrix = true;
	}

	public Vector3f getRight() {
		return right;
	}

	/**
	 * Set the distance of the near frustum plane.
	 *
	 * @param frustumNear the distance of the near frustum plane
	 */
	protected void setFrustumNear(float frustumNear) {
		if ( this.fn == frustumNear ) {
			return;
		}
		this.fn = frustumNear;
		refreshProjectionMatrix = true;
		refreshInverseProjectionViewMatrix = true;
	}

	public float getFrustumFar() {
		return ff;
	}

	/**
	 * Set the distance of the far frustum plane.
	 *
	 * @param frustumFar the distance of the far frustum plane
	 */
	protected void setFrustumFar(float frustumFar) {
		if ( this.ff == frustumFar ) {
			return;
		}
		this.ff = frustumFar;
		refreshProjectionMatrix = true;
		refreshInverseProjectionViewMatrix = true;
	}

	public float getFrustumLeft() {
		return fl;
	}

	/**
	 * Set the distance of the left frustum plane.
	 *
	 * @param frustumLeft the distance of the left frustum plane
	 */
	protected void setFrustumLeft(float frustumLeft) {
		if ( this.fl == frustumLeft ) {
			return;
		}
		this.fl = frustumLeft;
		refreshProjectionMatrix = true;
		refreshInverseProjectionViewMatrix = true;
	}

	public float getFrustumRight() {
		return fr;
	}

	/**
	 * Set the distance of the right frustum plane.
	 *
	 * @param frustumRight the distance of the right frustum plane
	 */
	protected void setFrustumRight(float frustumRight) {
		if ( this.fr == frustumRight ) {
			return;
		}
		this.fr = frustumRight;
		refreshProjectionMatrix = true;
		refreshInverseProjectionViewMatrix = true;
	}

	public float getFrustumTop() {
		return ft;
	}

	/**
	 * Set the distance of the top frustum plane.
	 *
	 * @param frustumTop the distance of the top frustum plane
	 */
	protected void setFrustumTop(float frustumTop) {
		if ( this.ft == frustumTop ) {
			return;
		}
		this.ft = frustumTop;
		refreshProjectionMatrix = true;
		refreshInverseProjectionViewMatrix = true;
	}

	public float getFrustumBottom() {
		return fb;
	}

	/**
	 * Set the distance of the bottom frustum plane.
	 *
	 * @param frustumBottom the distance of the bottom frustum plane
	 */
	protected void setFrustumBottom(float frustumBottom) {
		if ( this.fb == frustumBottom ) {
			return;
		}
		this.fb = frustumBottom;
		refreshProjectionMatrix = true;
		refreshInverseProjectionViewMatrix = true;
	}

	public void setOrthographic(boolean orthographic) {
		if ( this.orthographic == orthographic ) {
			return;
		}
		this.orthographic = orthographic;
		refreshProjectionMatrix = true;
		refreshInverseProjectionViewMatrix = true;
	}

	public boolean isOrthographic() {
		return orthographic;
	}

	/**
	 * {@inheritDoc}
	 */
	public Matrix4f getProjectionMatrix() {
		if ( refreshProjectionMatrix ) {
			doRefreshProjectionMatrix();
		}
		return projectionMatrix;
	}

	private void doRefreshProjectionMatrix() {
		Matrix4f m = projectionMatrix;
		// Reset projection matrix
		if ( !orthographic ) {
			m.m00 = 2.0f * fn / (fr - fl);
			m.m01 = 0.0f;
			m.m02 = (fr + fl) / (fr - fl); // zero if symmetric
			m.m03 = 0.0f;
			m.m10 = 0.0f;
			m.m11 = 2.0f * fn / (ft - fb);
			m.m12 = (ft + fb) / (ft - fb); // zero if symmetric
			m.m13 = 0.0f;
			m.m20 = 0.0f;
			m.m21 = 0.0f;
			m.m22 = -(ff + fn) / (ff - fn);
			m.m23 = -2.0f * ff * fn / (ff - fn);
			m.m30 = 0.0f;
			m.m31 = 0.0f;
			m.m32 = -1.0f;
			m.m33 = 0.0f;
		} else {
			m.m00 = 2.0f / (fr - fl);
			m.m01 = 0.0f;
			m.m02 = 0.0f;
			m.m03 = -(fr + fl) / (fr - fl); // zero if symmetric
			m.m10 = 0.0f;
			m.m11 = 2.0f / (ft - fb);
			m.m12 = 0.0f;
			m.m13 = -(ft + fb) / (ft - fb); // zero if symmetric
			m.m20 = 0.0f;
			m.m21 = 0.0f;
			m.m22 = -2.0f / (ff - fn);
			m.m23 = -(ff + fn) / (ff - fn);
			m.m30 = 0.0f;
			m.m31 = 0.0f;
			m.m32 = 0.0f;
			m.m33 = 1.0f;
		}
		refreshProjectionMatrix = false;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setFrustum(float near, float far, float left, float right, float top, float bottom) {
		setOrthographic(true);
		setFrustumNear(near);
		setFrustumFar(far);
		setFrustumLeft(left);
		setFrustumRight(right);
		setFrustumTop(top);
		setFrustumBottom(bottom);
	}

	/**
	 * {@inheritDoc}
	 */
	public void setFrustumPerspective(float fovY, float aspect, float near, float far) {
		setFrustumPerspective(fovY, aspect, near, far, 1, 1, 0, 0);
	}

	/**
	 * {@inheritDoc}
	 */
	public void setFrustumPerspective(
		float fovY, float aspect, float near, float far, int tilesX, int tilesY,
		int tileX, int tileY
	) {
		if ( Float.isNaN(aspect) || Float.isInfinite(aspect) ) {
			throw new IllegalArgumentException("Illegal value for aspect [" + aspect + "]");
		}
		if ( near >= far ) {
			throw new IllegalArgumentException("The passed value for near [" + near + "] must be greater than far ["
			                                   + far + "]");
		}
		if ( tileX < 0 || tileX >= tilesX || tileY < 0 || tileY >= tilesY ) {
			throw new IllegalArgumentException(
				"The tile indices must be at least 0 and at most the total number of tiles minus 1");
		}
		setOrthographic(false);
		float h = (float)Math.tan(Math.toRadians(fovY) * 0.5f) * near;
		float w = h * aspect;
		float left = -w + (float)tileX / tilesX * 2.0f * w;
		float right = left + 1.0f / tilesX * 2.0f * w;
		float bottom = -h + (float)tileY / tilesY * 2.0f * h;
		float top = bottom + 1.0f / tilesY * 2.0f * h;
		setFrustumLeft(left);
		setFrustumRight(right);
		setFrustumBottom(bottom);
		setFrustumTop(top);
		setFrustumNear(near);
		setFrustumFar(far);
	}

	/**
	 * {@inheritDoc}
	 */
	public Matrix4f getViewMatrix() {
		if ( refreshViewMatrix ) {
			doRefreshViewMatrix();
		}
		return viewMatrix;
	}

}