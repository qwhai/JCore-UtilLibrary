package org.commons.cabinet.math.bean.factory;

import org.commons.cabinet.math.bean.interf.Angle;
import org.commons.cabinet.math.bean.interf.Curve;

/**
 * <p>
 * 抽象工厂方法
 * </p>
 * Create Date: 2015年12月10日
 * Last Modify: 2016年5月26日
 * 
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public abstract class ShapeFactory {

    public abstract Angle createAngle();
    
    public abstract Curve createCurve();
}
