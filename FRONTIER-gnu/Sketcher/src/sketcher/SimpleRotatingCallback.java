   package sketcher;
	import javax.media.j3d.Node;
   import javax.media.j3d.Transform3D;

   public interface SimpleRotatingCallback {
   
      public void transformChanged(int type, Transform3D transform);
   }
