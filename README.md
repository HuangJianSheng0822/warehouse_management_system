# javaweb仓库管理系统
- 前端虽为为jsp,但只使用了${pageContext.request.contextPath}
- 前端ui为layui
- 使用少量ajax,是前后端分离项目

# 项目需求
基本模块要求如下：

- 1）登陆功能：需执行数据库连接，能根据用户名、密码判断是否为合法用户，登陆
成功跳转到主页面，登陆失败能弹出对话框提示。

- 2）主页面设计：登陆后将跳转到主页面，主页面上显示各功能页面的链接，点击
后进入相应功能页面。

- 3）商品基本信息维护功能：能实现商品基本信息的添加、更新、删除和按照商品名称进行查
询。
商品查询：能按照商品编号、商品名称执行模糊查询及复合 sql 语句（多表关联查询、多条件查询等），显示模糊查询结果。
商品修改/删除：对选中的商品信息，点击修改按钮后能保存到数据库，并刷新页面；或点击删除按钮后，能删除数据库中相应记录，并刷新页面显示。

- 4）入库作业：包括入库信息的添加与更新，查询与删除。

- 5）出库作业：包括入库信息的添加与更新，查询与删除。


- 6）商品全程跟踪：对每批商品进行出入库跟踪，要能够查询每批商品对应的各次出库记录及库存变化。

- 7）员工管理：员工的增删改查。

# 项目截图
![QQ截图20220712161549](https://user-images.githubusercontent.com/91519206/178444097-4ef2c143-676d-4a8c-878b-54aa560b6bb4.png)
![QQ截图20220712161607](https://user-images.githubusercontent.com/91519206/178444111-6ec2d44c-3942-4c9c-a83d-8409028e73d2.png)
![QQ截图20220712161623](https://user-images.githubusercontent.com/91519206/178444118-585e2e3e-a6bc-4781-8772-085136c246ff.png)
![QQ截图20220712161648](https://user-images.githubusercontent.com/91519206/178444129-7b5a8c6c-6d2e-4444-b688-10aa755f97b9.png)
![QQ截图20220712161704](https://user-images.githubusercontent.com/91519206/178444135-a38ffa6d-591c-43aa-a5ac-a73c27e4594b.png)
![QQ截图20220712161717](https://user-images.githubusercontent.com/91519206/178444145-bf505306-0cdf-491c-aa36-e581b6ce3579.png)
![QQ截图20220712161727](https://user-images.githubusercontent.com/91519206/178444151-045a91e5-b507-4e31-98be-006087805365.png)
![QQ截图20220712161740](https://user-images.githubusercontent.com/91519206/178444157-51b475cf-730d-409c-9c8f-e0397d465dfe.png)
![QQ截图20220712161754](https://user-images.githubusercontent.com/91519206/178444162-b3f05829-9ad2-45d7-8371-b1f577f367b6.png)

# 数据库
warehouse_management_system.sql
