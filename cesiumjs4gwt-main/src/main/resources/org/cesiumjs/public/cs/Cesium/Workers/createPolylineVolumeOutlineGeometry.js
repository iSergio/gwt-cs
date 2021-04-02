define(["./when-54335d57","./Cartesian2-8646c5a1","./arrayRemoveDuplicates-3fea1e5f","./BoundingRectangle-07202124","./Transforms-79117a7b","./ComponentDatatype-1a100acd","./PolylineVolumeGeometryLibrary-4d0ebb44","./Check-24483042","./GeometryAttribute-374f805d","./GeometryAttributes-caa08d6c","./IndexDatatype-82ceea78","./Math-d6182036","./PolygonPipeline-97a7160d","./RuntimeError-88a32665","./WebGLConstants-95ceb4e9","./EllipsoidTangentPlane-325a8e68","./IntersectionTests-5394f658","./Plane-13ae4b1b","./PolylinePipeline-3803a6c2","./EllipsoidGeodesic-cc216670","./EllipsoidRhumbLine-2b7999f3"],function(d,c,a,r,u,y,o,e,h,g,f,t,l,i,n,s,p,m,E,v,P){"use strict";function _(e){var i=(e=d.defaultValue(e,d.defaultValue.EMPTY_OBJECT)).polylinePositions,n=e.shapePositions;this._positions=i,this._shape=n,this._ellipsoid=c.Ellipsoid.clone(d.defaultValue(e.ellipsoid,c.Ellipsoid.WGS84)),this._cornerType=d.defaultValue(e.cornerType,o.CornerType.ROUNDED),this._granularity=d.defaultValue(e.granularity,t.CesiumMath.RADIANS_PER_DEGREE),this._workerName="createPolylineVolumeOutlineGeometry";i=1+i.length*c.Cartesian3.packedLength;i+=1+n.length*c.Cartesian2.packedLength,this.packedLength=i+c.Ellipsoid.packedLength+2}_.pack=function(e,i,n){var t;n=d.defaultValue(n,0);var a=e._positions,r=a.length;for(i[n++]=r,t=0;t<r;++t,n+=c.Cartesian3.packedLength)c.Cartesian3.pack(a[t],i,n);var o=e._shape,r=o.length;for(i[n++]=r,t=0;t<r;++t,n+=c.Cartesian2.packedLength)c.Cartesian2.pack(o[t],i,n);return c.Ellipsoid.pack(e._ellipsoid,i,n),n+=c.Ellipsoid.packedLength,i[n++]=e._cornerType,i[n]=e._granularity,i};var k=c.Ellipsoid.clone(c.Ellipsoid.UNIT_SPHERE),C={polylinePositions:void 0,shapePositions:void 0,ellipsoid:k,height:void 0,cornerType:void 0,granularity:void 0};_.unpack=function(e,i,n){i=d.defaultValue(i,0);for(var t=e[i++],a=new Array(t),r=0;r<t;++r,i+=c.Cartesian3.packedLength)a[r]=c.Cartesian3.unpack(e,i);var t=e[i++],o=new Array(t);for(r=0;r<t;++r,i+=c.Cartesian2.packedLength)o[r]=c.Cartesian2.unpack(e,i);var l=c.Ellipsoid.unpack(e,i,k);i+=c.Ellipsoid.packedLength;var s=e[i++],p=e[i];return d.defined(n)?(n._positions=a,n._shape=o,n._ellipsoid=c.Ellipsoid.clone(l,n._ellipsoid),n._cornerType=s,n._granularity=p,n):(C.polylinePositions=a,C.shapePositions=o,C.cornerType=s,C.granularity=p,new _(C))};var b=new r.BoundingRectangle;return _.createGeometry=function(e){var i=e._positions,n=a.arrayRemoveDuplicates(i,c.Cartesian3.equalsEpsilon),t=e._shape,t=o.PolylineVolumeGeometryLibrary.removeDuplicatesFromShape(t);if(!(n.length<2||t.length<3)){l.PolygonPipeline.computeWindingOrder2D(t)===l.WindingOrder.CLOCKWISE&&t.reverse();i=r.BoundingRectangle.fromPoints(t,b);return function(e,i){var n=new g.GeometryAttributes;n.position=new h.GeometryAttribute({componentDatatype:y.ComponentDatatype.DOUBLE,componentsPerAttribute:3,values:e});var t=i.length,i=n.position.values.length/3,a=e.length/3/t,r=f.IndexDatatype.createTypedArray(i,2*t*(1+a)),o=0,l=0,s=l*t;for(c=0;c<t-1;c++)r[o++]=c+s,r[o++]=c+s+1;for(r[o++]=t-1+s,r[o++]=s,s=(l=a-1)*t,c=0;c<t-1;c++)r[o++]=c+s,r[o++]=c+s+1;for(r[o++]=t-1+s,r[o++]=s,l=0;l<a-1;l++)for(var p=t*l,d=p+t,c=0;c<t;c++)r[o++]=c+p,r[o++]=c+d;return new h.Geometry({attributes:n,indices:f.IndexDatatype.createTypedArray(i,r),boundingSphere:u.BoundingSphere.fromVertices(e),primitiveType:h.PrimitiveType.LINES})}(o.PolylineVolumeGeometryLibrary.computePositions(n,t,i,e,!1),t)}},function(e,i){return(e=d.defined(i)?_.unpack(e,i):e)._ellipsoid=c.Ellipsoid.clone(e._ellipsoid),_.createGeometry(e)}});
