package com.zking.erp.shiro;//package com.zking.erp.shiro;
//
//import com.zking.ssm.model.SysUser;
//import com.zking.ssm.service.ISysUserService;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.apache.shiro.util.ByteSource;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class ShiroRealm extends AuthorizingRealm {
//
//    @Autowired
//    private ISysUserService sysUserService;
//
//    /**
//     * 授权
//     * @param principals
//     * @return
//     */
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        return null;
//    }
//
//    /**
//     * 认证
//     * @param authenticationToken
//     * @return
//     * @throws AuthenticationException
//     */
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        System.out.println("doGetAuthenticationInfo...");
//        //身份---用户名
//        String username = authenticationToken.getPrincipal().toString();
//        //凭证---密码
//        String password = authenticationToken.getCredentials().toString();
//        //根据username获取当前登录的用户信息
//        SysUser sysUser = sysUserService.queryUserByUsername(username);
//        if(null==sysUser){
//            throw new UnknownAccountException();
//        }
//
//        //第一个参数：数据库中查询出的用户对象的账号  ,还可以传对象
//        //第二个参数：数据库中ljjjjjjjjjjjjjjjjjij78吧查询出的用户对象的密码
//        //第三个参数: 加密盐
//        //第三个参数：当前Realm,例如:this.getName()获取类的全路径名
//        SimpleAuthenticationInfo simpleAuthenticationInfo=
//                new SimpleAuthenticationInfo(
//                        sysUser.getUsername(),
//                        sysUser.getPASSWORD(),
//                        ByteSource.Util.bytes(sysUser.getSalt()),
//                        this.getName()
//                );
//
//        return simpleAuthenticationInfo;
//    }
//}
